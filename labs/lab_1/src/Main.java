// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(5, 10);
        Drawable[] shapes = { circle, rectangle };
        Drawing drawing = new Drawing(shapes);

        for (Drawable shape: shapes) {
            System.out.println("Area : " + ((Shape) shape).area());
        }

        drawing.drawAll();
    }
}