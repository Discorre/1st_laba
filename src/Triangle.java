public class Triangle {
    double side1; // Длина первой стороны треугольника
    double side2; // Длина второй стороны треугольника
    double side3; // Длина третьей стороны треугольника

    // Конструктор класса Triangle
    public Triangle(double s1, double s2, double s3) {
        // Проверяем, что все стороны положительны
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            // При выполнении условия выводит ошибку
            throw new IllegalArgumentException("Все стороны треугольника должны быть положительными числами.");
        }

        // Проверяем неравенство треугольника
        if (!(s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1)) {
            // При выполнении условия выводит ошибку
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует.");
        }

        side1 = s1; // Присваиваем значение первой стороне
        side2 = s2; // Присваиваем значение второй стороне
        side3 = s3; // Присваиваем значение третьей стороне
    }

    // Метод для получения периметра треугольника
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Метод для вычисления площади треугольника
    public double getArea() {
        double s = getPerimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Формула Герона
    }

    // Метод для определения, является ли треугольник равнобедренным
    public boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3; // Проверяем равенство хотя бы двух сторон
    }
}
