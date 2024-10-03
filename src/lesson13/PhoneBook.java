package lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
private HashMap<String, List<String>> abonents = new HashMap<>();


    public void addAbonent(String name, String phone) {
        if (!abonents.containsKey(name)) {// проверяем есть ли он у нас в коллекции, если нет :

            ArrayList<String>phones = new ArrayList<>();
            phones.add(phone);
            abonents.put(name,phones);

        } else { //если уже есть абонент в телефонной книге

            List<String> phones = abonents.get(name); // достаю ВСЕ телефоны этого абонента
            phones.add(phone);//добавляем новый номер абонента
            abonents.put(name, phones);

        }
    }

    public void printAllAbonents(){
        for (String name: abonents.keySet()) {
            System.out.println(name + " - " + abonents.get(name));
        }
    }
}
