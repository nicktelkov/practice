public class Main {
    public static void main (String args){
        Animal cat1 = new Cat("Барсик", "Белый", 3);
        cat1.run(150);
        Animal cat2 = new Cat("Васька", "Черный", 2);
        cat2.swim(100);
        Animal dog1 = new Dog("Полкан", "Рыжий", 1);
        dog1.run(200);
        Animal dog2 = new Cat("Бобик", "Серый", 7);
        dog2.swim(50);

        System.out.printf("Всего животных %d%n", Animal.getCounter());
    }
}
