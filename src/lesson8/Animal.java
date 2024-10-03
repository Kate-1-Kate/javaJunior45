package lesson8;


public class Animal  {
private int age;
private String name;
private String poroda;

    public Animal() {

    }

    public Animal(int age, String name, String poroda) {
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }


}
