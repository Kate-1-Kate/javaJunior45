package lesson15.domashka;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


public class NicknameSupplier implements Supplier<String> {

    @Override
    public String get() {
        List<String> nicknameList = new ArrayList<>();
        nicknameList.add("Чумной Доктор");
        nicknameList.add("Спящая красавица");
        nicknameList.add("Искатель приключений");
        nicknameList.add("Медведь на велосипеде");
        nicknameList.add("Капитан Очевидность");

        int value = (int)(Math.random() * nicknameList.size());
        return nicknameList.get(value);
    }
}
