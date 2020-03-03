import java.util.Random;
import java.util.Scanner;

public class GameXO {
    // Константы поля
    public static char[][] field;
    public static final int size = 9;
    public static final int dotToWin = 4;
    // Константы фишек
    public static final char dotEmpty = '•';
    public static final char dotCross = 'X';
    public static final char dotZero = 'O';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void initField() {  // Инициализация поля
        field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = dotEmpty;
            }
        }
    }

    public static void printField() {  // Печать поля
        for (int i = 0; i <= size; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(" " + (i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j] + "  ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (field[x][y] == dotEmpty) return true;
        return false;
    }

    public static boolean isFieldFull() {
        int empty = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j< size; j++){
                if (field[i][j] == dotEmpty){
                    empty++;
                }
            }
        }
        if (empty != 0){
            return false;
        }
        return true;
    }

    public static boolean victoryCheck(char symb){
        for (int i = 0; i < field.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0, d3 = 0,d4 = 0,d5 = 0,d6 = 0,d7 = 0;
            for (int j = 0; j < field.length; j++) {
                sx += field[i][j] == symb ? 1 : 0;
                sy += field[j][i] == symb ? 1 : 0;
                d1 += field[j][j] == symb ? 1 : 0;
                d2 += field[j][field.length - j - 1] == symb ? 1 : 0;
                d3 += field[j][j+1] == symb ? 1 : 0;
               /* не понимаю как правильно проверить все возможные диагонали
                d4 += field[j][j+2] == symb ? 1 : 0;
                d5 += field[j][j+3] == symb ? 1 : 0;
                d6 += field[j][j+4] == symb ? 1 : 0;
                d7 += field[j][j+5] == symb ? 1 : 0;
                */
                if (sx == dotToWin || sy == dotToWin || d1 == dotToWin
                        || d2 == dotToWin) {
                    return true;
                }
            }
        }
        return false;

    }
/*
Методы public static int lookTurnX() и public static int lookTurnY()
предназначены для блокировки хода человека:
по шаблону проверки на выыигры проверяется заполнения крестиков - если до выигрыша игрока нужен 1 ход
компьтер блокирует ход. Корректно реализовть не удалось - блокировка нормально арбоатет только по диагонали d1

 */

    public static int lookTurnX(){
        int x = 0;
        for (int i = 0; i < field.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < field.length; j++) {
                sx += field[i][j] == dotCross ? 1 : 0;
                if (sx == (dotToWin -1)) {
                    x = i + 1;
                    return x;
                }
                sy += field[j][i] == dotCross ? 1 : 0;
                if (sy == (dotToWin -1)) {
                    x = j;
                    return x;
                }

                d1 += field[j][j] == dotCross ? 1 : 0;
                if (d1 == (dotToWin -1)) {
                    x = j +1;
                    return x;
                }

                d2 += field[j][field.length - j - 1] == dotCross ? 1 : 0;
                if (d2 == (dotToWin -1)){
                    x = i  -1;
                    return x;
                }

            }
        }
        return rand.nextInt(size);

    }
    public static int lookTurnY (){
       int y = 0;
        for (int i = 0; i < field.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < field.length; j++) {
                sx += field[i][j] == dotCross ? 1 : 0;
                if (sx == (dotToWin -1)) {
                    y = j;
                    return y;
                }
                sy += field[j][i] == dotCross ? 1 : 0;
                if (sy == (dotToWin -1)) {
                    y = j + 1;
                    return y;
                }

                d1 += field[j][j] == dotCross ? 1 : 0;
                if (d1 == (dotToWin -1)) {
                    y = j +1;
                    return y;
                }

                d2 += field[j][field.length - j - 1] == dotCross ? 1 : 0;
                if (d2 == (dotToWin -1)){
                    y = (field.length - j - 2);
                    return y;
                }

            }
            }
        return rand.nextInt(size);
        }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки: X, Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        field[x][y] = dotCross;
    }

    public static void pcTurn() {
        int x, y;
        do {
             x = lookTurnX();
             y = lookTurnY();
        } while (!isCellValid(x, y));
        field[x][y] = dotZero;
        System.out.println("Компьютер выбрал ячейку " + (x + 1) + " " + (y + 1));

    }

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (victoryCheck(dotCross)) {
                System.out.println("Победил человек");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            pcTurn();
            printField();
            if (victoryCheck(dotZero)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }
}