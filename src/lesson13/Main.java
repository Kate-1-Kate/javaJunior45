package lesson13;

public class Main {
    public static void main(String[] args) {

        Holodilnik holodilnik = new Holodilnik();

        holodilnik.addProdut("Яблоко",300);
        holodilnik.addProdut("Молоко",1000);
        holodilnik.addProdut("Яблоко",200);
        holodilnik.addProdut("Яйцо",4);

        holodilnik.printAllProducts();
        // Создаём рецепт roducts();
          //яблочного пирога

        Recept pirog = new Recept();
        pirog.setName("Яблочный пирог");
        pirog.setTimeToCook(50);
        pirog.setDescription("Яблочный пирог");
        pirog.addIngridient("Яблоко",200);
        pirog.addIngridient("Молоко",500);
        pirog.addIngridient("Яйцо",8);
        pirog.addIngridient("Мука",600);

       // holodilnik.canCook(pirog);
        //holodilnik.productLeastOfAll();
        //holodilnik.printVesProduct();
       // holodilnik.printProductWithSmallRemainder();


    }
}
