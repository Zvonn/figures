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

        System.out.println("3. ТЕСТИРОВАНИЕ ТРЕУГОЛЬНИКОВ:");
        System.out.println("------------------------------");

        try {
            Triangle triangle1 = new Triangle();
            System.out.println("Треугольник 1 (по умолчанию - равносторонний):");
            System.out.println(triangle1);
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания треугольника: " + e.getMessage());
        }

        try {
            Triangle triangle2 = new Triangle(3.0, 4.0, 5.0, "blue", true);
            System.out.println("Треугольник 2 (стороны=3,4,5, цвет=синий, заливка=true):");
            System.out.println(triangle2);
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания треугольника: " + e.getMessage());
        }

        try {
            Triangle triangle3 = new Triangle(5.0, 5.0, 8.0, "orange", false);
            System.out.println("Треугольник 3 (стороны=5,5,8, цвет=оранжевый, заливка=false):");
            System.out.println(triangle3);
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка создания треугольника: " + e.getMessage());
        }

        System.out.println("4. ТЕСТ С НЕВАЛИДНЫМ ТРЕУГОЛЬНИКОМ:");
        System.out.println("-----------------------------------");
        try {
            Triangle invalidTriangle = new Triangle(1.0, 2.0, 10.0, "black", true);
            System.out.println(invalidTriangle);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();

        System.out.println("5. ДЕМОНСТРАЦИЯ МЕТОДОВ ТРЕУГОЛЬНИКА:");
        System.out.println("-------------------------------------");

        Triangle demoTriangle = new Triangle(6.0, 8.0, 10.0, "purple", true);
        System.out.println("Демонстрационный треугольник:");
        System.out.println("Сторона 1: " + demoTriangle.getSide1());
        System.out.println("Сторона 2: " + demoTriangle.getSide2());
        System.out.println("Сторона 3: " + demoTriangle.getSide3());
        System.out.println("Цвет: " + demoTriangle.getColor());
        System.out.println("Заливка: " + demoTriangle.isFilled());
        System.out.println("Площадь: " + String.format("%.2f", demoTriangle.getArea()));
        System.out.println("Периметр: " + String.format("%.2f", demoTriangle.getPerimeter()));
        System.out.println("Тип: " + demoTriangle.getTriangleType());
        System.out.println("Прямоугольный: " + demoTriangle.isRightTriangle());
    }
}