package lesson6;

import lesson6.saper.SaperUtils;

import java.util.Random;
import java.util.Scanner;

public class TestHomeWork {

    public static void main(String[] args) {
         // Первая задача с массивом,заполняющимся рандомными числами
        int [][] filledArray = new int[6][6];
         HomeWork6_1.numberOfEvenNumbers(filledArray);
         // Первая задача с уже заполненным массивом
        int [][] filled2Array = {{2, 3, 4, 5, 6},
                                 {1, 2, 3, 4, 5},
                                 {0, 1, 2, 3, 4},
                                 {3, 4, 5, 6, 7},
                                 {4, 5, 6, 7, 8}};
        HomeWork6_1.numberOfEvenNumbers2(filled2Array);

         // Вторая задача

        int a = 12;
        int b = 6;
        int c = 14;
        int d = 2;
        int e = 56;
        System.out.println("Минимальное число : " + MetodJava.printMinimumNumber(a,b,c,d,e));


        // Третья задача

        int[] array = new int[8];

        System.out.println(MetodJava.fillingTheArray(array));


        // Четвёртая задача

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 12,чтобы узнать какой календарный месяц соответствует этому номеру : ");
        int numberMonth = scanner.nextInt();
         MetodJava.printSelectedMonth(numberMonth);


         // Пятая задача

        int one = 12;
        int two = 1;
        int three = 14;

        MetodJava.defineRealityTriangle(one,two,three);



    }












    }


