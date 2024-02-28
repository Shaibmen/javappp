public class Romb extends Figure{
    private double diagonal1;
    private double diagonal2;
    private double side;

    public Romb(double diagonal1, double diagonal2, double side) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    @Override
    double calculateS() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    double calculateP() {
        return 4 * side;
    }
}
