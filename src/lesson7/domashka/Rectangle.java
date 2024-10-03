package lesson7.domashka;

public class Rectangle {
private int a;
private int b;

    public Rectangle(){
        System.out.println("Теперь мы создали самый настоящий четырёхгранный прямоугольник!");
    }
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getPerimetr(){
        return (a + b) * 2;
    }
    public int getPloshad(){
        return a * b;
    }

}

