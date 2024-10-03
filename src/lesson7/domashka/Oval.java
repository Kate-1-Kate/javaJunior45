package lesson7.domashka;

public class Oval {
private int a;
private int b;
private double axisOne;
private double axisTwo;

    public Oval(int a, int b) {
        this.a = a;
        this.b = b;
    }

   public Oval(double axisOne,double axisTwo){
        this.axisOne = axisOne;
        this.axisTwo = axisTwo;
   }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getAxisOne() {
        return axisOne;
    }

    public double getAxisTwo() {
        return axisTwo;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setAxisOne(double axisOne) {
        this.axisOne = axisOne;
    }

    public void setAxisTwo(double axisTwo) {
        this.axisTwo = axisTwo;
    }

    public double getPerimetr(){
        return 2 * Math.PI * Math.sqrt(((a * a) + (b * b)) / 2 );
    }
    public double getPloshad(){
        return Math.PI * a * b;
    }
    public double getPloshadThroughAxis(){

        return Math.PI * (axisOne * axisTwo) / 4;
    }
}
