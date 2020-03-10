public class Animal {
    private static int counter;
    public String name;
    public String color;
    public static int age;

    public Animal (String name, String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
        counter++;
    }
    public void AnimalInfo() {
        System.out.println(name + " " + color+ " " +  age);

    }
    public void run(int dst) {
        System.out.println("Животное пробежало " + dst);
    }
    public  void swim(int dst) {
        System.out.println("Животное проплыло " + dst);
    }
    public static int getCounter() {
        return counter;
    }
}
