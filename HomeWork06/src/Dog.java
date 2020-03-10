public class Dog extends Animal {
    final int dogRun = 500;
    final int dogSwim = 10;
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public  void run(int dst) {
        if (dst <= dogRun) {
            System.out.println("Пес " + name + " пробежал " + dst);
        } else {
            System.out.println("Пес не может пробежать больше " + dst);
        }
    }

    @Override
    public  void swim(int dst) {
        if (dst <= dogRun) {
            System.out.println("Пес " + name + " проплыл " + dst);
        } else {
            System.out.println("Пес не может проплыть больше " + dst);
        }
    }
}

