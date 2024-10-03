package lesson16;

import lesson16.domashka.UncurrentAgeException;

public class Person {
private int age;
private String name;

    public void setAge(int age) {
      if (age < 0 || age > 150){
          throw new UncurrentAgeException();
      }
        this.age = age;
    }
}
