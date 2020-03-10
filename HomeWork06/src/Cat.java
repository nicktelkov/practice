public class Cat extends Animal {

    final int catRun = 200;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

      @Override
   public  void run(int dst) {
       if (dst <= catRun) {
          System.out.println("Кот " + name + " пробежал " + dst);
       } else {
           System.out.println("Кот не может пробежать больше " + dst);
        }
    }

    @Override
    public  void swim(int dst) {
        System.out.println("Кот не умеет плавать");
    }

}
