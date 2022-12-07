
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Triangle triangle1 = new Triangle(4, 5);
        Square square = new Square(5);

        System.out.println("area circle " + String.format("%.2f",circle1.getArea()));
        System.out.println("area triangle " + triangle1.getArea());
        System.out.println("area square " + square.getArea());

        GeometricFigure[] geometricFigures = new GeometricFigure[]{
                circle1,
                triangle1,
                square,
        };
        double sum = 0;

        for (int i = 0; i < geometricFigures.length; i++) {
        sum += geometricFigures[i].getArea();}
            System.out.println("the sum of the areas of all geometric figures  "+ String.format("%.2f",sum));
        }
    }








