package lesson6;

import java.util.Random;

public class HomeWork6_1 {

    // Первый метод (тут заполняет двумерный массив рандомными числами и из них находит количество чётных)
    public static void numberOfEvenNumbers(int[][] filledArray) {

        int row = filledArray.length;
        int col = filledArray[0].length;
        int evenNumber = 0;

        Random random = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                filledArray[i][j] = random.nextInt(200);
                if (filledArray[i][j] % 2 == 0 && filledArray[i][j] != 0) {
                    evenNumber += 1;

                }



            }
        }
        System.out.println(evenNumber);
    }

    //Тут предоставлен уже заполненный массив
    public static void numberOfEvenNumbers2 (int[][] filled2Array){
        int row = filled2Array.length;
        int col = filled2Array[0].length;
        int evenNumber = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (filled2Array[i][j] % 2 == 0 && filled2Array[i][j] != 0) {
                    evenNumber += 1;

                }



            }
        }
        System.out.println(evenNumber);
    }
}






