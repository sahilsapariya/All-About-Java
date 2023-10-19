
class Rectangle extends Shape implements Drawable {
    final private double width;
    final private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}