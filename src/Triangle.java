
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }



    public Triangle(double side1, double side2, double side3) {
        super();
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Невозможно создать треугольник с данными сторонами");
        }
    }


    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Невозможно создать треугольник с данными сторонами");
        }
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (isValidTriangle(side1, this.side2, this.side3)) {
            this.side1 = side1;
        } else {
            throw new IllegalArgumentException("Невозможно изменить сторону: нарушено неравенство треугольника");
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (isValidTriangle(this.side1, side2, this.side3)) {
            this.side2 = side2;
        } else {
            throw new IllegalArgumentException("Невозможно изменить сторону: нарушено неравенство треугольника");
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (isValidTriangle(this.side1, this.side2, side3)) {
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Невозможно изменить сторону: нарушено неравенство треугольника");
        }
    }


    private boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                a + b > c &&
                a + c > b &&
                b + c > a;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }


    public String getTriangleType() {
        if (side1 == side2 && side2 == side3) {
            return "Равносторонний";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Равнобедренный";
        } else {
            return "Разносторонний";
        }
    }

    public boolean isRightTriangle() {
        double a = side1, b = side2, c = side3;
        // Проверяем теорему Пифагора для всех комбинаций сторон
        return Math.abs(a*a + b*b - c*c) < 1e-10 ||
                Math.abs(a*a + c*c - b*b) < 1e-10 ||
                Math.abs(b*b + c*c - a*a) < 1e-10;
    }


    @Override
    public String toString() {
        return "Triangle: " +
                "\nsides = " + side1 + ", " + side2 + ", " + side3 +
                "\n" + super.toString() +
                "\narea = " + String.format("%.2f", getArea()) +
                "\nperimeter = " + String.format("%.2f", getPerimeter()) +
                "\ntype = " + getTriangleType() +
                "\nright triangle = " + isRightTriangle();
    }
}