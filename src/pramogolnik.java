public class pramogolnik extends Figure{
    private double length;
    private double width;

    public pramogolnik(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateS() {
        return length * width;
    }

    @Override
    double calculateP() {
        return 2 * (length + width);
    }
}
