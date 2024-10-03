package lesson3;

public class Main1 {

    public static void main(String[] args) {

        //Вывести на консоль числа от 5 до 500, которые делятся одновременно на 3 и 5 без остатка

        for ( int i = 5; i <= 500; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }








    }



}
