public class Triangle implements GeometricFigure {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (side * height / 2);
    }
}
