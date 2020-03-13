public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (n > food) {
            return false;
        }
        else {
            food -= n;
            return true;
        }

    }
    public void fillPlate (int f) {
        food += f;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}