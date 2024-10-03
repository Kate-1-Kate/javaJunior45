package lesson2;

public class Main3 {

    public static void main(String[] args) {

       int a = 9;
       int b = 7;
       int c = 7;

       if(a==b && b==c && a==c) {
           System.out.println("Равносторонний треугольник");
       } else if (a != b && b != c && a !=c){
           System.out.println("Разносторонний треугольник");
       } else {
           System.out.println("Равнобедренный треугольник");
       }





    }




}
