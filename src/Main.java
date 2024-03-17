import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean continueLoop = true;

        System.out.println("Выберите тип фигуры (прямоугольник / треугольник / окружность):");

        while (continueLoop) {

            String choise = in.nextLine();

            if (choise.equalsIgnoreCase("треугольник")) {
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
                break;
            }
            else if (choise.equalsIgnoreCase("прямоугольник")){
                System.out.println("Введите ширину прямоугольника:");
                double width = in.nextDouble();
                System.out.println("Введите высоту прямоугольника:");
                double height = in.nextDouble();

                Rectangle rectangle = new Rectangle(width, height);

                System.out.println("Площадь прямоугольника: " + rectangle.getArea());
                System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
                System.out.println("Длина диагонали прямоугольника: " + rectangle.getDiagonalLength());
                break;
            }
            else{
                System.out.println("Неправильный выбор. Пожалуйста, введите 'прямоугольник' или 'треугольник' или 'окружность'.");
            }
        }
        in.close();
    }
}