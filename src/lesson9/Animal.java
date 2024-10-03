package lesson9;

import java.util.Objects;

public abstract class Animal {
private int age;
private String poroda;


    public Animal() {
    }

    public Animal(int age, String poroda) {
        this.age = age;
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public abstract void voice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(poroda, animal.poroda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, poroda);
    }
}
