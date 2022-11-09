package Week10;

public class text {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.computeArea());
        Circle c2 = new Circle();
        System.out.println(c2.computeArea());
        Circle circle1 = new Circle(10);
        circle1.setVar();
        circle1.outputVar();

    }
}
