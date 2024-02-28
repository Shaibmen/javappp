public class Paralelogram extends Figure{
    private double base;
    private double side;
    private double height;

    public Paralelogram(double base, double side, double height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }

    @Override
    double calculateS() {
        return base * height;
    }

    @Override
    double calculateP() {
        return 2 * (base + side);
    }
}
