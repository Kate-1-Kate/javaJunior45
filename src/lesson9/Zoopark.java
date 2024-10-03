package lesson9;

public class Zoopark {
    public static void main(String[] args) {

        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey();

        Tiger tiger = new Tiger();
        Tiger tiger1 = new Tiger();

        Animal[] animals = new Animal[4];
        animals[0] = monkey;
        animals[1] = monkey1;
        animals[2] = tiger;
        animals[3] = tiger1;

        for (Animal a : animals){
            a.voice();
        }



    }
}
