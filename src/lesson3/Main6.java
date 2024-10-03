package lesson3;

public class Main6 {

    public static void main(String[] args) {

        //Объеденить 2 массива в один

        char[] qwer = {'q','w','e','r'};
        char[] abcd = {'a','b','c','d'};

        char[] qwerabcd = new char[qwer.length + abcd.length];

        for(int i = 0; i < qwerabcd.length; i++){
            if(i < qwerabcd.length){
                qwerabcd[i] = qwer[i];
            } else {
                qwerabcd[i] = abcd[i - qwer.length];
            }
        }




    }

}
