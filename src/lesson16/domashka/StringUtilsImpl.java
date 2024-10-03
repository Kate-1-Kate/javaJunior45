package lesson16.domashka;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (number1 == null || number2 == null) {

            throw new NullPointerException("number1 == null || number2 == null");
        }
        if (Double.parseDouble(number2) == 0) {
            throw new ArithmeticException("number2 == 0");
        }

        try {
            Double.parseDouble(number1);
            Double.parseDouble(number2);

        } catch (NumberFormatException e) {

            throw new NumberFormatException("number1 и number2 не являются числами!");
        }

        double result = Double.parseDouble(number1) / Double.parseDouble(number2);
        return result;

    }

    @Override
    public int[] fillNumbers(String text, String word) throws NullPointerException {
        if (text == null || word == null) {

            throw new NullPointerException("text == null || word == null");
        }

        Pattern pattern = Pattern.compile("(?i)(?u)" + word);
        Matcher matcher = pattern.matcher(text);

        List<Integer> wordsList = new ArrayList();

        while (matcher.find()) {
            wordsList.add(matcher.start());
        }


        int[] wordsArray = new int[wordsList.size()];

        for (int i = 0; i < wordsList.size(); i++) {
             wordsArray[i] = wordsList.get(i);
        }

        for (Integer a : wordsArray){
            System.out.println();
        }


        return wordsArray;
    }


    @Override
    public double[] findNumbers(String text) throws CustomException {

        String regex = "[-+]?\\d+(\\.\\d+)?";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        List<Double> numbersList = new ArrayList<>();

        while (matcher.find()) {
            double number = Double.parseDouble(matcher.group());
            numbersList.add(number);
        }

        if (numbersList.isEmpty()) {

            throw new CustomException("Not found");
        }

        double[] numbersArray = new double[numbersList.size()];

        for (int i = 0; i < numbersList.size(); i++) {
            numbersArray[i] = numbersList.get(i);
        }

        for (Double number : numbersArray){
            System.out.println();
        }

        return numbersArray;



    }
    }






