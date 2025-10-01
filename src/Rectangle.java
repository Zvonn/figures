
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }


    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }


    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "\nwidth = " + width + ", height = " + height +
                "\n" + super.toString() +
                "\narea = " + String.format("%.2f", getArea()) +
                "\nperimeter = " + String.format("%.2f", getPerimeter());
    }
}