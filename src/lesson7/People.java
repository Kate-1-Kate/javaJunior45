package lesson7;

public class People {

    // (поля класса)
    private int age;
    private String name;

    public People(){

    }

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
