package lesson6.saper;

import java.util.Scanner;

public class ScannerUtils {

    public static String getLevel (){

            System.out.println("Выберите уровень игры : ");
            System.out.println("1 - Новичок");
            System.out.println("2 - Любитель");
            System.out.println("3 - Профессионал");
            System.out.println("4 - Особый");

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();

            if(!answer.equals("1") && !answer.equals("2") && !answer.equals("3") && !answer.equals("4")
                    && !answer.equalsIgnoreCase("Новичок")
                    && !answer.equalsIgnoreCase("Любитель")
                    && !answer.equalsIgnoreCase("Профессионал")
                    && !answer.equalsIgnoreCase("Особый"))
                {
                    System.out.println("------- Упс, повторите ввод : ------- ");
                    return ScannerUtils.getLevel();
            }
            return answer;

    }




}
