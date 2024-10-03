package lesson3;

public class Main5 {

    public static void main(String[] args) {

        char[] chars = {'e','0','2','s','-'};
        //длина - 5, последний индекс - 4

        //Напечатать на консоль массив в обратном порядке

        for(int i = chars.length - 1; i>= 0; i--){
            System.out.println(chars[i]);
        }



    }


}
