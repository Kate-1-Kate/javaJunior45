package lesson8;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Tigr tigr = new Tigr();
        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = monkey;
        animals[2] = tigr;


    }
}
