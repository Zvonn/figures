
public class GeometricObjectTest {
    public static void main(String[] args) {
        System.out.println("=== МОДЕЛИРОВАНИЕ ГЕОМЕТРИЧЕСКИХ ФИГУР ===\n");

        System.out.println("1. ТЕСТИРОВАНИЕ КРУГОВ:");
        System.out.println("-----------------------");

        Circle circle1 = new Circle();
        System.out.println("Круг 1 (по умолчанию):");
        System.out.println(circle1);
        System.out.println();

        Circle circle2 = new Circle(5.0, "red", true);
        System.out.println("Круг 2 (радиус=5, цвет=красный, заливка=true):");
        System.out.println(circle2);
        System.out.println();

        Circle circle3 = new Circle(3.5, "blue", false);
        System.out.println("Круг 3 (радиус=3.5, цвет=синий, заливка=false):");
        System.out.println(circle3);
        System.out.println();

        System.out.println("2. ТЕСТИРОВАНИЕ ПРЯМОУГОЛЬНИКОВ:");
        System.out.println("--------------------------------");

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Прямоугольник 1 (по умолчанию):");
        System.out.println(rectangle1);
        System.out.println();

        Rectangle rectangle2 = new Rectangle(4.0, 6.0, "green", true);
        System.out.println("Прямоугольник 2 (ширина=4, высота=6, цвет=зеленый, заливка=true):");
        System.out.println(rectangle2);
        System.out.println();

        Rectangle rectangle3 = new Rectangle(2.5, 3.5, "yellow", false);
        System.out.println("Прямоугольник 3 (ширина=2.5, высота=3.5, цвет=желтый, заливка=false):");
        System.out.println(rectangle3);
        System.out.println();

        System.out.println("3. ДЕМОНСТРАЦИЯ МЕТОДОВ:");
        System.out.println("-----------------------");

        System.out.println("Информация о круге 2:");
        System.out.println("Радиус: " + circle2.getRadius());
        System.out.println("Цвет: " + circle2.getColor());
        System.out.println("Заливка: " + circle2.isFilled());
        System.out.println("Площадь: " + String.format("%.2f", circle2.getArea()));
        System.out.println("Периметр: " + String.format("%.2f", circle2.getPerimeter()));
        System.out.println();

        System.out.println("Информация о прямоугольнике 2:");
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Цвет: " + rectangle2.getColor());
        System.out.println("Заливка: " + rectangle2.isFilled());
        System.out.println("Площадь: " + String.format("%.2f", rectangle2.getArea()));
        System.out.println("Периметр: " + String.format("%.2f", rectangle2.getPerimeter()));
    }
}