public class Drawing {
    final private Drawable[] shapes;
    public Drawing (Drawable[] shapes){
        this.shapes = shapes;
    }

    public void drawAll() {
        for (Drawable shape: shapes) {
            shape.draw();
        }
    }
}
