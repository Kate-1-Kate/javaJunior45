package lesson15.domashka;

import java.util.Scanner;

public class MainFunction {
    public static void main(String[] args) {

        System.out.println("Погадаем на картах. Выберите цифру от 1 до 4 : ");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        System.out.println(new CardPredictionFunction().apply(answer));



    }
}
