package lesson6.saper;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {

    public static int[][] getGameField(String level) {

        if (level.equals("1") || level.equalsIgnoreCase("Новичок")){
            return new int[9][9];
        }
        if (level.equals("2") || level.equalsIgnoreCase("Любитель")){
            return new int[16][16];

        }
        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")){
            return new int[16][30];
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество колонок : ");
        int col = scanner.nextInt();
        System.out.println("Введите количество строк : ");
        int row = scanner.nextInt();

        return new int[row][col];


    }
    //метод будет рааставлять рандомно мины
    //в зависимости от выбранного уровня

    public static void fildRandomMines(int[][] field, String level){
        int mines = 0;
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")){
            mines = 10;
        }
        if (level.equals("2") || level.equalsIgnoreCase("Любитель")){
            mines = 40;

        }
        if (level.equals("3") || level.equalsIgnoreCase("Профессионал")){
            mines = 99;

        }
        if (level.equals("4") || level.equalsIgnoreCase("Особый")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Скольк мин вы хотите расставить ?");
            mines = scanner.nextInt();

        }
        for (int i = 0; i < mines; i++){
            int row = ThreadLocalRandom.current().nextInt(0, field.length);
            int col = ThreadLocalRandom.current().nextInt(0, field[0].length);
            if (field[row][col] == -1){
                i--;
            }
            field[row][col] = -1;

        }
    }
    public static void fillMinesCounter (int [][] field){
        int[][] template = new int[field.length + 2][field[0].length + 2];
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j< field[0].length; j++){
                if (field[i][j] == -1){
                    template[i + 1][j + 1] = -1;
                }
            }
        }
        for (int i = 0; i < template.length; i++){
            for (int j = 0; j < template[i].length; i++){
                if (template[i][j] == -1){
                    if (template[i - 1][j - 1] != -1){
                        template[i - 1][j - 1] += 1;
                    }
                    if (template[i - 1][j] != -1) {
                        template[i - 1][j] += 1;
                    }
                    if (template[i - 1][j + 1] != -1) {
                        template[i - 1][j + 1] += 1;
                    }
                    if (template[i][j + 1] != -1) {
                        template[i][j + 1] += 1;
                    }
                    if (template[i][j - 1] != -1) {
                        template[i][j - 1] += 1;
                    }
                    if (template[i + 1][j - 1] != -1){
                        template[i + 1][j - 1] += 1;
                    }
                    if (template[i + 1][j] != -1) {
                        template[i + 1][j] += 1;
                    }
                    if (template[i + 1][j + 1] != -1) {
                        template[i + 1][j + 1] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j< field[i].length; j++){
                field[i][j] = template[i + 1][j + 1];
            }
        }
    }
}
