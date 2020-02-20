// Домашнее задание №1
// 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
public class HomeWork01 {
    public static void main (String[] args){
//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte bt = -2;
        short s = 27;
        int i = 322;
        long l = 19823784L;
        float f = 123,5746f;
        double d = -123.123;
        char cr = 'Y';
        boolean b = false;

//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        public static double expressionFirts (double a, double b, double c, double d){
            return a * (b + (c / d));
        }
//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        public static boolean summ (int a, int b){
            int s = a + b;
            if (s > = 10 && s < = 20) {
                return true;
            }
                else {
                    return false;
            }
        }
  /*
  Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали,
  или отрицательное; Замечание: ноль считаем положительным числом.
   */
        public static void numberDeterm (int number){
            if (number > = 0) {
                System.out.println(number + " - положительное число");
            }
            else{
                System.out.println(number + " - отрицательеное число");
            }
        }
 //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean negativeCheck (int number){
            if (number <0){
                return true;
            }
            else {
                return false;
            }
    }
//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void helloName (String name){
            System.out.println("Привет, " + name + "!");
        }
/*
8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
 */
    public static void leapYear (int year){
      int everyFourth = year % 4; //вычисляем годы кратные 4 - если остаток от деления - 0
      int hundredthYear = year % 100; //вычисляем годы кратные 4 - если остаток от деления - 100
      int fourHundredthYear = year % 400; //вычисляем годы кратные 4 - если остаток от деления - 400


      if (everyFourth != 0 || hundredthYear == 0 && fourHundredthYear != 0){ // Год не кратный 4, не четрехсотый, но сотый 
          System.out.println(year + " - год невисокосный");
      }
      else{
          System.out.println(year + " - год високосный");
      }
        }
}
