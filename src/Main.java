import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину первой стороны треугольника:");
        double side1 = in.nextDouble();
        System.out.println("Введите длину второй стороны треугольника:");
        double side2 = in.nextDouble();
        System.out.println("Введите длину третьей стороны треугольника:");
        double side3 = in.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Является ли треугольник равнобедренным: " + triangle.isIsosceles());

    }
}
