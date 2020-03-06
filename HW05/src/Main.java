/*
Домашнее задание
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

 */
public class Main {
    private static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван", "Иванович", "Иванов", "инженер", "ivan@workmail.com", 892312312, 750000.00 ,27);
        employees[1] = new Employee("Николай", "Иванович", "Иванов", "инженер", "ivan@workmail.com", 892312312, 750000.00 ,35);
        employees[2] = new Employee("Петр", "Иванович", "Иванов", "старший инженер", "ivan@workmail.com", 892312312, 750000.00 ,47);
        employees[3] = new Employee("Дмитрий", "Иванович", "Иванов", "стажер", "ivan@workmail.com", 892312312, 750000.00 ,23);
        employees[4] = new Employee("Василий", "Иванович", "Иванов", "старший инженер", "ivan@workmail.com", 892312312, 750000.00 ,41);

      for (int i = 0; i <= employees.length; i ++) {
          if (employees[i].getAge() > 40){
              employees[i].employeeInfo();
          }
      }


    }
}
