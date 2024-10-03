package lesson15.domashka;

import java.util.ArrayList;
import java.util.List;

public class MainSupplier {
    public static void main(String[] args) {

        System.out.println("Ваш никнейм : ");
        String nickname = new NicknameSupplier().get();
        System.out.println(nickname);

        System.out.println("Ваш возраст : ");
        int age = new GetAgeSupplier().get();
        System.out.println(age + " лет");




    }

}
