public class Trapec extends Figure{
    private double base1;
    private double base2;
    private double side1;
    private double side2;
    private double height;

    public Trapec(double base1, double base2, double side1, double side2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    double calculateS() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    double calculateP() {
        return base1 + base2 + side1 + side2;
    }
}
