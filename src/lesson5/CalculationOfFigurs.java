package lesson5;

import java.util.Scanner;

public class CalculationOfFigurs {

    public static void main(String[] args) {

        System.out.println("Какую фигуру хотите посчитать ");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Овал,Эллипс");
        System.out.println("3 - Круг");
        System.out.println("4 - Квадрат");
        System.out.println("5 - Трапеция");
        System.out.println("6 - Парралелограм");
        System.out.println("7 - Конус");

        Scanner scanner = new Scanner(System.in);
        int inputFigura = scanner.nextInt();

        if (inputFigura == 1) {
            System.out.println("Что хотите посчитать");
            System.out.println("1 - площадь");
            System.out.println("2 - периметр");
            int imputAction = scanner.nextInt();

            System.out.println("Введите длины каждой из трёх сторон треугольника : ");
            int a = scanner.nextInt();
            System.out.println("a =  ");
            int b = scanner.nextInt();
            System.out.println("b =  ");
            int c = scanner.nextInt();
            System.out.println("c =  ");
            if (imputAction == 1) {
                System.out.println("Площадь треугольника : " + FigursUtils.ploshadTreug(a, b, c));
            } else {
                System.out.println("Периметр треугольника : " + FigursUtils.printPerimetrTreug(a, b, c));
            }

        }
        if (inputFigura == 2) {
            System.out.println("Что хотите посчитать");
            System.out.println("1 - площадь");
            System.out.println("2 - периметр");
            int imputAction = scanner.nextInt();

            System.out.println("Введите длину двух полуосей : ");
            int a = scanner.nextInt();
            System.out.println("a =  ");
            int b = scanner.nextInt();
            System.out.println("b =  ");

            if (imputAction == 1) {
                System.out.println("Площадь овала (эллипса) : " + FigursUtils.ploshadOval(a, b));
            } else {
                System.out.println("Периметр оавала (эллипса) : " + FigursUtils.perimetrOval(a, b));
            }

        }
        if (inputFigura == 3) {
            System.out.println("Что хотите посчитать");
            System.out.println("1 - площадь");
            System.out.println("2 - периметр");
            int imputAction = scanner.nextInt();

            System.out.println("Введите радиус (в мм) : ");
            int radius = scanner.nextInt();
            System.out.println("a =  ");

            if (imputAction == 1) {
                System.out.println("Площадь круга : " + FigursUtils.ploshadKruga(radius));
            } else {
                System.out.println("Периметр круга : " + FigursUtils.ploshadKruga(radius));
            }
        }
        if (inputFigura == 4) {
            System.out.println("Что хотите посчитать");
            System.out.println("1 - площадь");
            System.out.println("2 - периметр");
            int imputAction = scanner.nextInt();

            System.out.println("Введите длину стороны квадрата : ");
            int a = scanner.nextInt();
            System.out.println("a = ");

            if (imputAction == 1) {
                System.out.println("Площадь круга : " + FigursUtils.ploshadKruga(a));
            } else {
                System.out.println("Периметр круга : " + FigursUtils.ploshadKruga(a));
            }

        }
        if (inputFigura == 5) {
            System.out.println("Что хотите посчитать");
            System.out.println("1 - площадь");
            System.out.println("2 - периметр");
            int imputAction = scanner.nextInt();

            System.out.println("Введите длины двух оснований (a,b), далее длину высоты(h) : ");
            int a = scanner.nextInt();
            System.out.println("a =  ");
            int b = scanner.nextInt();
            System.out.println("b =  ");
            int h = scanner.nextInt();
            System.out.println("h =  ");

            if (imputAction == 1) {
                System.out.println("Площадь овала (эллипса) : " + FigursUtils.ploshadTrapezoid(a, b, h));
            } else {
                System.out.println("Введите длины двух боковых сторон : ");
                int c = scanner.nextInt();
                System.out.println("c =  ");
                int d = scanner.nextInt();
                System.out.println("d =  ");


                System.out.println("Периметр овала (эллипса) : " + FigursUtils.perimetrTrapezoid(a, b, c, d));
            }
        }
        if (inputFigura == 6) {
            System.out.println("Что хотите посчитать");
            System.out.println("1 - площадь");
            System.out.println("2 - периметр");
            int imputAction = scanner.nextInt();

            System.out.println("Введите длины двух сторон (a,b), далее длину высоты(h) : ");
            int a = scanner.nextInt();
            System.out.println("a =  ");
            int b = scanner.nextInt();
            System.out.println("b =  ");
            int h = scanner.nextInt();
            System.out.println("h =  ");

            if (imputAction == 1) {
                System.out.println("Площадь параллелограма : " + FigursUtils.ploshadParollelogam(a, h));
            } else {
                System.out.println("Периметр параллелограма : " + FigursUtils.perimetrParollelogram(a, b));
            }
        }
        if (inputFigura == 7) {
            System.out.println("Что хотите посчитать");
            System.out.println("1 - площадь");
            System.out.println("2 - объём");
            int imputAction = scanner.nextInt();

            System.out.println("Введите длину образующей конуса (l), далее радиус (в мм) : ");
            int l = scanner.nextInt();
            System.out.println("l =  ");
            int radius = scanner.nextInt();
            System.out.println("radius (R) =  ");

            if (imputAction == 1) {
                System.out.println("Площадь конуса : " + FigursUtils.ploshadCone(l, radius));
            } else {
                System.out.println("Введите длину высоты, она потребуется для рассчёта объёма : ");
                int h = scanner.nextInt();
                System.out.println("h =  ");
                System.out.println("Объём конуса : " + FigursUtils.volumeCone(h, radius));
            }
        }
    }
}