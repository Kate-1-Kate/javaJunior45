package lesson7.domashka;

public class Square {
private int a;

    public Square(){
        System.out.println(" Ура, мы создали поразительно красивый квадрат! ");
    }
    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getPerimetr(){
        return a + a + a + a;
    }
    public int getPloshad(){
        return a * a;
    }
    public double getDiagonal() {
        return Math.hypot(a, a);
    }
}
