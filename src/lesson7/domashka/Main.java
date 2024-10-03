package lesson7.domashka;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(13,20,14);

        System.out.println("Периметр треугольника равен : " + triangle.getPerimetr());
        System.out.println("Площадь треугольника равна : " + triangle.getPloshad());
        System.out.println("Площадь треугольника (через высоту и основание) равна : " + triangle.getPloshadThroughHeight());

        Square square1 = new Square();
        Square square = new Square(20);

        System.out.println(" Периметр квадрата равен : " + square.getPerimetr() );
        System.out.println(" Площадь квадрата равна : " + square.getPloshad());
        System.out.println(" Площадь квадрата (через диагональ) равна : " + square.getDiagonal());

        Rectangle rectangle = new Rectangle(10,15);
        Rectangle rectangle1 = new Rectangle();

        System.out.println(" Периметр прямоугольника равен : " + rectangle.getPerimetr());
        System.out.println(" Площадь прямоугольника равна : " + rectangle.getPloshad());

        Oval oval = new Oval(12,14);
        Oval oval1 = new Oval(22.5,30.6);

        System.out.println(" Периметр овала равен : " + oval.getPerimetr());
        System.out.println(" Площадь овала (по полуосям) равна : " + oval.getPloshad());
        System.out.println(" Площадь овала (по осям) равна : " + oval1.getPloshadThroughAxis());

    }
}
