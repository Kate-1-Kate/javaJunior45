package lesson8.domashka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Гарри Поттер и философский камень",362, 1997,
                "Bloomsbury","Роман,Фэнтези","Дж.К.Роулинг");

        Book book2 = new Book("Отель Бертрам",237,1965,
                "ACT","Мистерия, детектив, криминальный жанр","Агата Кристи");

        Magazine magazine = new Magazine("Forbes",160,2004,
                "The Forbes",26);

        Magazine magazine1 = new Magazine("Cosmopolitan",120,1996,
                "Hearst Corporation",12);

        PrintedPublication printedPublications[] = new PrintedPublication[4];
        printedPublications[0] = book;
        printedPublications[1] = book2;
        printedPublications[2] = magazine;
        printedPublications[3] = magazine1;

       for(PrintedPublication pe: printedPublications){
           System.out.println(pe.toString());
       }

    }

}
