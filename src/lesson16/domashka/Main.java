package lesson16.domashka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StringUtilsImpl stringUtils = new StringUtilsImpl();

        //1

        String a = "12";
        String b = "6";

        System.out.println(stringUtils.div(a,b));


        //2

        int [] wordOccurenceIndices;

        String text = "Хулиган убежал прочь, глаза хулигана наполнились слезами," +
                       " хулиган сам не ожидал, хулиган, хулиган";

        String word = "Хулиган";

        wordOccurenceIndices = stringUtils.fillNumbers(text,word);
        System.out.println(Arrays.toString(wordOccurenceIndices));


        // 3

        String text2 = "т-235екст";
        double [] numbers;

        try {
            numbers = stringUtils.findNumbers(text2);
            System.out.println(Arrays.toString(numbers));
        } catch (CustomException e) {
            new CustomException("Not found");
        }














    }
}
