package lesson13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Holodilnik {
     private HashMap<String, Integer> products = new HashMap<>();

     public void addProdut(String product, int value) {
         if (products.containsKey(product)) {
             products.put(product, products.get(product) + value);
         } else {
             products.put(product, value);
         }
     }

     public void printAllProducts() {
         for (String pr : products.keySet()) {
             System.out.println(pr + " - " + products.get(pr));
         }
     }

     public void getProduct(String product, int value) {
         if (!products.containsKey(product)) {
             System.out.println(" Такого продукта в холодильнике нет ! -  " + product);
             return;
         }
         if (products.get(product) > value) {
             System.out.println(" Такого продукта недостаточно ! - " + product);
             return;
         }

         products.put(product, products.get(product) - value);
     }

     public void canCook(Recept pirog) {

         int countNotEnough = 0;

         for (String ingr : pirog.getIngridients().keySet()) {

             if (!products.containsKey(ingr)) {
                 countNotEnough++;
                 System.out.println("Такого у нас нет : " + ingr + " его нужно " + pirog.getIngridients().get(ingr));
             } else {
                 if (products.get(ingr) < pirog.getIngridients().get(ingr)) {
                     countNotEnough++;
                     System.out.println("Продукта : " + ingr + " недостаточно, " + " не хватает ещё : "
                             + (pirog.getIngridients().get(ingr) - products.get(ingr)));
                 }
             }

         }
         if (countNotEnough == 0) {
             System.out.println(" Ура! Мы можем приготовить это блюдо : " + pirog.getName());
         }
     }
}



