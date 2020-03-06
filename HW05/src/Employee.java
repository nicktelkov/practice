public class Employee {
    private String name;
    private String middleName;
    private String lastName;
    private String position;
    private String email;
    private int cell;
    private double salary;
    private int age;
    private static int id;

    public Employee(String name, String middleName, String lastName, String position, String email, int cell, int salary, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.cell = cell;
        this.salary = salary;
        this.age = age;
        id++;
    }

    public void employeeInfo() {
        System.out.println(name + " " + middleName + " " +  lastName);
        System.out.println("Должность " + position);
        System.out.println("Email " + email);
        System.out.println("Мобильный " + cell);
        System.out.println("Зарплата " + salary);
        System.out.println("Возраст " + salary);
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getCell() {
        return cell;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

}
