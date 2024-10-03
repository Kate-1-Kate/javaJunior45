package lesson16;

import lesson16.domashka.UncurrentAgeException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(200);
        }catch (UncurrentAgeException e){

        }

    }
}
