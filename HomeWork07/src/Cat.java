public class Cat {
    private String name;
    private int appetite;
    private boolean full;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        full = p.decreaseFood(appetite);
    }
}
