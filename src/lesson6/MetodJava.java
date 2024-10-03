package lesson6;

import java.util.Random;
import java.util.Scanner;

public class MetodJava {

    // Второй метод
    public static int printMinimumNumber (int a,int b, int c,int d, int e){

        int min = Math.min(Math.min(a, b), Math.min(c, d));
        if (min > e ){
            return e;
        }else {
            return min;
        }
    }
    // Третий метод
    public static int [] fillingTheArray (int[] array){

        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
        return array;
    }
    // Четвёртый метод
    public static void printSelectedMonth(int numberMonth){
        String nameMonth = "Упс, такого месяца не существует...";
        if (numberMonth ==1){
            nameMonth = "Январь";

        }
        if (numberMonth == 2){
            nameMonth = "Февраль";

        }
            if (numberMonth == 3){
            nameMonth = "Март";

            }
        if (numberMonth == 4){

            nameMonth = "Апрель";

        }
        if (numberMonth == 5){

            nameMonth = "Май";

        }
        if (numberMonth == 6){
            nameMonth = "Июнь";

        }
        if (numberMonth == 7){

            nameMonth = "Июль";

        }
        if (numberMonth == 8){

            nameMonth = "Август";

        }
        if (numberMonth == 9){

            nameMonth = "Сентябрь";

        }
        if (numberMonth == 10){

            nameMonth = "Октябрь";

        }
        if (numberMonth == 11){

            nameMonth = "Ноябрь";

        }
        if (numberMonth == 12){

            nameMonth = "Декабрь";

        }
        if (numberMonth < 1 && numberMonth > 12) {
            System.out.println(nameMonth);
        }

        System.out.println(nameMonth);

    }
    // Пятый метод
    public static void defineRealityTriangle (int one, int two, int three){
        if (one + two <= three || one + two <= three || one + two <= three) {
            System.out.println("Такой треугольник невозможен!!!");

        } else {
            System.out.println("Да, такой треугольник возможен.");
        }
    }

}

