package lesson12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, 2.5, "Gold",50);
        Coin coin2 = new Coin(5, 1999, 2.5, "Gold",45);
        Coin coin3 = new Coin(10, 1990, 2.5, "Gold",30);
        Coin coin4 = new Coin(50, 1899, 5, "Olovo",80);
        Coin coin5 = new Coin(5, 1869, 10, "Silver",100);
        Coin coin6 = new Coin(5, 1869, 10, "Zmetall",96);

        Set<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins){
            System.out.println(coin);
        }

        System.out.println("-----------------------------------------");
        System.out.println(" Теперь сортируем по году : ");
        System.out.println("-----------------------------------------");


        Set<Coin> coinsSortByYears = new TreeSet<>(new SortByYearComparator());
        coinsSortByYears.add(coin1);
        coinsSortByYears.add(coin2);
        coinsSortByYears.add(coin3);
        coinsSortByYears.add(coin4);
        coinsSortByYears.add(coin5);
        coinsSortByYears.add(coin6);

        for (Coin coin : coinsSortByYears){
            System.out.println(coin);
        }

        System.out.println("-----------------------------------------");
        System.out.println(" Теперь сортируем по наименованию металла : ");
        System.out.println("-----------------------------------------");

        Set<Coin> coinsSortByMetallName = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (!o1.getMetalName().equals(o2.getMetalName())){
                    return o1.getMetalName().compareTo(o2.getMetalName());
                }
                if (o1.getYear() != o2.getYear()){
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getNominal() != o2.getNominal()){
                    return o1.getNominal() - o2.getNominal();
                }
                if (o1.getRarityOfTheCoin() != o2.getRarityOfTheCoin()){
                    return o1.getRarityOfTheCoin() - o2.getRarityOfTheCoin();
                }

                return Double.compare(o2.getDiameter(), o1.getDiameter());
            }
        });
        coinsSortByMetallName.add(coin1);
        coinsSortByMetallName.add(coin2);
        coinsSortByMetallName.add(coin3);
        coinsSortByMetallName.add(coin4);
        coinsSortByMetallName.add(coin5);
        coinsSortByMetallName.add(coin6);

        for (Coin coin : coinsSortByMetallName){
            System.out.println(coin);
        }

        System.out.println("-----------------------------------------");
        System.out.println(" Теперь сортировка, где важна редкости монеты : ");
        System.out.println("-----------------------------------------");

        Set<Coin> coinsSortByRarity = new TreeSet<>(new SortByRarityComparator());
        coinsSortByRarity.add(coin1);
        coinsSortByRarity.add(coin2);
        coinsSortByRarity.add(coin3);
        coinsSortByRarity.add(coin4);
        coinsSortByRarity.add(coin5);
        coinsSortByRarity.add(coin6);

        for (Coin coin : coinsSortByRarity){
            System.out.println(coin);
        }

        System.out.println("-----------------------------------------");
        System.out.println(" Сортировка, где наименее важна редкости монеты : ");
        System.out.println("-----------------------------------------");

        Set<Coin> coinsSortByRarity1 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getYear() != o2.getYear()){
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getNominal() != o2.getNominal()){
                    return o1.getNominal() - o2.getNominal();
                }
                if (!o1.getMetalName().equals(o2.getMetalName())){
                    return o1.getMetalName().compareTo(o2.getMetalName());
                }
                if (o2.getDiameter() != o1.getDiameter()){
                    return Double.compare(o2.getDiameter(), o1.getDiameter());
                }
                return o1.getRarityOfTheCoin() - o2.getRarityOfTheCoin();
            }

        });
        coinsSortByRarity.add(coin1);
        coinsSortByRarity.add(coin2);
        coinsSortByRarity.add(coin3);
        coinsSortByRarity.add(coin4);
        coinsSortByRarity.add(coin5);
        coinsSortByRarity.add(coin6);

        for (Coin coin : coinsSortByRarity){
            System.out.println(coin);
        }



    }
}
