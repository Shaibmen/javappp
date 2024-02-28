class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateS() {
        return side * side;
    }

    @Override
    double calculateP() {
        return 4 * side;
    }
}