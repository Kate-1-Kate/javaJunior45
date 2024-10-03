package lesson12;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
   private int nominal;
   private int year;
   private String metalName;
   private double diameter;
   private int rarityOfTheCoin;

    public Coin(int nominal, int year, double diameter, String metalName,int rarityOfTheCoin) {
        this.nominal = nominal;
        this.year = year;
        this.diameter = diameter;
        this.metalName = metalName;
        this.rarityOfTheCoin = rarityOfTheCoin;
    }

    public int getRarityOfTheCoin() {
        return rarityOfTheCoin;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMetalName() {
        return metalName;
    }

    public void setRarityOfTheCoin(int rarityOfTheCoin) {
        this.rarityOfTheCoin = rarityOfTheCoin;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diameter, coin.diameter) == 0 && rarityOfTheCoin == coin.rarityOfTheCoin && Objects.equals(metalName, coin.metalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, metalName, diameter, rarityOfTheCoin);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", metalName='" + metalName + '\'' +
                ", diameter=" + diameter +
                ", rarityOfTheCoin=" + rarityOfTheCoin +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if (this.nominal != o.nominal){
            return this.nominal - o.nominal;
        }
        if (this.year != o.year){
            return this.year - o.year;
        }
        if (!this.metalName.equals(o.metalName)){
            return this.metalName.compareTo(o.metalName);
        }
        if (this.rarityOfTheCoin!= o.rarityOfTheCoin){
            return this.rarityOfTheCoin - o.rarityOfTheCoin;
        }
       return Double.compare(this.diameter,o.diameter);
    }
}
