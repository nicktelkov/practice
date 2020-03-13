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
    public boolean getFull(){
        return full;
    }
    public String getName(){
        return name;
    }
    public void fill() {
        if (full) {
            System.out.println(name + " - сытый");
        } else {
            System.out.println(name + " - голодный");
        }
    }
}
