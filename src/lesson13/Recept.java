package lesson13;

import java.util.HashMap;
import java.util.Objects;

public class Recept {
    private String name;
    private int timeToCook;
    private String description;
    private HashMap<String,Integer> ingridients = new HashMap<>();

    public Recept() {
    }

    public Recept(String name, int timeToCook, String description) {
        this.name = name;
        this.timeToCook = timeToCook;
        this.description = description;
    }

    public void addIngridient(String product, int value) {
        ingridients.put(product,value);
    }

    public String getName() {
        return name;
    }

    public int getTimeToCook() {
        return timeToCook;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeToCook(int timeToCook) {
        this.timeToCook = timeToCook;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIngridients(HashMap<String, Integer> ingridients) {
        this.ingridients = ingridients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recept recept = (Recept) o;
        return timeToCook == recept.timeToCook && Objects.equals(name, recept.name) && Objects.equals(description, recept.description) && Objects.equals(ingridients, recept.ingridients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, timeToCook, description, ingridients);
    }

    @Override
    public String toString() {
        return "Recept{" +
                "name='" + name + '\'' +
                ", timeToCook=" + timeToCook +
                ", description='" + description + '\'' +
                ", ingridients=" + ingridients +
                '}';
    }
}


