public class Circle {
    double radius;
    int degree;

    public Circle(double r, int d) {
        // Проверяем, что все радиус положителен
        if (r <= 0) {
            throw new IllegalArgumentException("Такой окружности не существует.");
        }
        // Проверяем, что угол сектора меньше 360 градусов
        if (d > 360) {
            throw new IllegalArgumentException("Угол должен быть меньше 360 градусов.");
        }


        this.radius = r;
        this.degree = d;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getAreaOfACircle() {
        return Math.PI * radius * radius;
    }

    public double getAreaOfACircularSector() {
        return getAreaOfACircle() * ((double) degree / 360);
    }
}
