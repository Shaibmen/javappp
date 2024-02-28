public class Paralelepid extends Figure{
    private double length;
    private double width;
    private double height;

    public Paralelepid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateS() {
        return 2 * (length * width + width * height + length * height);
    }

    @Override
    double calculateP() {
        return 4 * (length + width + height);
    }
}
