package lesson7.domashka;

public class Triangle {
private int a;
private int b;
private int c;
private int h;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double getPloshad (){

        double p = getPerimetr()/2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int  getPloshadThroughHeight(){
        return a + h;
    }

    public int getPerimetr() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Такой треугольник невозможен!!!");
            return 0;
        } else {
            return a + b + c;
        }



    }
}
