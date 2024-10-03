package lesson13;

public class Main1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addAbonent("Вася" , "+7986332233");
        phoneBook.addAbonent("Вася" , "+3333333333");
        phoneBook.addAbonent("Вася" , "+55555555555");
        phoneBook.addAbonent("Петя" , "+7000000000");

        phoneBook.printAllAbonents();
    }
}
