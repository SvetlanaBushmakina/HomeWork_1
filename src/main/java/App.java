public class App {
    public static void main(String[] args) {
        System.out.println("Hello World, я Светлана");

    //Дополнительные задания
        //Площадь квадрата
        int a = 15;
        int s = Square.square(a);
        System.out.println("Площадь квадрата = " + s);

        //Площадь круга
        double r = 3;
        System.out.println("Площадь круга = " + Circle.circle(r));

        // Площадь треугольника
        double b = 4;
        double h = 13;
        System.out.println("Площадь треугольника = " + Triangle.triangle(b, h));
    }
}
