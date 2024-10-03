package lesson9;

public class Monkey extends Animal implements ZooAnimal {
    @Override
    public void voice() {
        System.out.println("Yyyyyyy aaaaaaaa!");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает!");
    }

    @Override
    public void climb() {
        System.out.println("Обезьяна лазит");
    }
}
