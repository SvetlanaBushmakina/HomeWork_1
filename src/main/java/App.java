public class App {
    public static void main(String[] args) {
        System.out.println("Hello World, я Светлана");

    //Дополнительные задания
        //Площадь квадрата
        int a = 15;
        System.out.println("Площадь квадрата = " + Square.squareOfSquare(a));

        //Площадь круга
        double r = 3;
        System.out.println("Площадь круга = " + Circle.squareOfCircle(r));

        // Площадь треугольника
        double b = 4;
        double h = 13;
        System.out.println("Площадь треугольника = " + Triangle.squareOfTriangle(b, h));
    }
}
