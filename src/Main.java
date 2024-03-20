import java.util.Scanner; // Импортируем класс Scanner из пакета java.util для чтения ввода пользователя

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Создаем объект Scanner для чтения ввода пользователя

        boolean continueLoop = true; // Флаг для продолжения выполнения цикла

        System.out.println("Выберите тип фигуры (прямоугольник / треугольник / окружность):"); // Выводим приглашение для выбора типа фигуры

        while (continueLoop) { // Начинаем бесконечный цикл, пока флаг continueLoop равен true

            String choice = in.nextLine(); // Считываем ввод пользователя

            if (choice.equalsIgnoreCase("треугольник")) { // Если пользователь выбрал "треугольник"
                System.out.println("Введите длину первой стороны треугольника:"); // Запрашиваем длину первой стороны
                double side1 = in.nextDouble(); // Считываем значение первой стороны
                System.out.println("Введите длину второй стороны треугольника:"); // Запрашиваем длину второй стороны
                double side2 = in.nextDouble(); // Считываем значение второй стороны
                System.out.println("Введите длину третьей стороны треугольника:"); // Запрашиваем длину третьей стороны
                double side3 = in.nextDouble(); // Считываем значение третьей стороны

                Triangle triangle = new Triangle(side1, side2, side3); // Создаем объект треугольника

                // Выводим информацию о треугольнике
                System.out.println("Периметр треугольника: " + triangle.getPerimeter());
                System.out.println("Площадь треугольника: " + triangle.getArea());
                System.out.println("Является ли треугольник равнобедренным: " + triangle.isIsosceles());
                break; // Выходим из цикла
            }
            else if (choice.equalsIgnoreCase("прямоугольник")){ // Если пользователь выбрал "прямоугольник"
                System.out.println("Введите ширину прямоугольника:"); // Запрашиваем ширину
                double width = in.nextDouble(); // Считываем значение ширины
                System.out.println("Введите высоту прямоугольника:"); // Запрашиваем высоту
                double height = in.nextDouble(); // Считываем значение высоты

                Rectangle rectangle = new Rectangle(width, height); // Создаем объект прямоугольника

                // Выводим информацию о прямоугольнике
                System.out.println("Площадь прямоугольника: " + rectangle.getArea());
                System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
                System.out.println("Длина диагонали прямоугольника: " + rectangle.getDiagonalLength());
                break; // Выходим из цикла
            }
            else if (choice.equalsIgnoreCase("окружность")){ // Если пользователь выбрал "окружность"
                System.out.println("Введите радиус окружности: "); // Запрашиваем радиус
                double radius = in.nextDouble(); // Считываем значение радиуса
                System.out.println("Введите угол для поиска площади кругового сектора: "); // Запрашиваем угол
                int degree = in.nextInt(); // Считываем значение угла

                Circle circle = new Circle(radius, degree); // Создаем объект окружности

                // Выводим информацию об окружности
                System.out.println("Длина окружности: " + circle.getCircumference());
                System.out.println("Площадь круга: " + circle.getAreaOfACircle());
                System.out.println("Площадь сектора круга: " + circle.getAreaOfACircularSector());
                break; // Выходим из цикла
            }
            else{ // Если пользователь ввел неверную строку, то выводим уведомление и возвращаем в начало цикла
                System.out.println("Неправильный выбор. Пожалуйста, введите 'прямоугольник' или 'треугольник' или 'окружность'.");
            }
        }
        in.close(); // Закрываем Scanner
    }
}
