public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateS() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateP() {
        return 2 * Math.PI * radius;
    }
}
