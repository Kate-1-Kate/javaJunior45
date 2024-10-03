package lesson5;

public class FigursUtils {

    //1 - Треугольник

    public static double ploshadTreug (int a, int b, int c){

        double p = (a + b + c)/2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double printPerimetrTreug(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Такой треугольник невозможен!!!");
            return 0;
        } else {
           return a + b + c;
        }

    }

    // 2 - Овал

    public static double perimetrOval(int a, int b){
        return  2 * Math.PI * Math.sqrt(((a * a) + (b * b)) / 2);
    }
    public static double ploshadOval(int a, int b){
        return Math.PI * a * b;
    }

    // 3 - Круг
    public static double perimetrKruga(int radius){
        return 2 * Math.PI * radius;
    }
    public static double ploshadKruga(int radius){
        return Math.PI * (radius * radius);
    }

    // 4 - Квадрат
    public static double perimetrKvadrata(int a){
        return a + a + a + a;
    }
    public static double ploshadRvadrata(int a){
        return Math.pow(a,a);
    }

    // 5 - Трапеция
    public static double ploshadTrapezoid(int a, int b, int h){
        return (a + b) / 2 * h;
    }
    public static double perimetrTrapezoid(int a, int b, int c, int d){
        return a + b + c + d;
    }

    // 6 - Параллелограмм
    public static double ploshadParollelogam(int a, int h){
        return a * h;
    }
    public static double perimetrParollelogram(int a, int b){
        return 2 * (a + b);
    }

    // 7 - Конус
    public static double ploshadCone(int l, int radius){
        return (Math.PI * radius * l) + (Math.PI * (radius * radius));
    }
    public static double volumeCone(int h, int radius){
        return (Math.PI * Math.PI * radius * h) / 3;
    }








}
