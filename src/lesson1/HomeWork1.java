package lesson1;

public class HomeWork1 {

    public static void main(String[] args) {

        int budget = 1000;
        int snikersPrice = 35;
        double candyPrice = 3.5;

        int amountOfSnikers = budget / snikersPrice;
        System.out.println(amountOfSnikers = budget / snikersPrice);

        int residualAmount = budget - (amountOfSnikers * snikersPrice);
        double amountOfCandy = residualAmount / candyPrice;
        Integer integerAmountOfCandy = (int) Math.floor(amountOfCandy);
        System.out.println( integerAmountOfCandy = (int) Math.floor(amountOfCandy));

        double sdacha = residualAmount - (integerAmountOfCandy * candyPrice);
        System.out.println(sdacha = residualAmount - (integerAmountOfCandy * candyPrice));





    }


}
