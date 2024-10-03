package lesson2;

public class MainDZ {

    public static void main(String[] args) {

   int money = 1000;
   int snikersCost = 35;
   double candyCost = 3.5;

   int snikersCanBy = money / snikersCost;
   int restMoneyAfterSnikersBy = money % snikersCost;

   int candyCanBy = (int) (restMoneyAfterSnikersBy / candyCost);
   double restOfMoney = restMoneyAfterSnikersBy - (candyCanBy * candyCost);

        System.out.println("Кол-во сникерсов" + snikersCanBy);
        System.out.println(candyCanBy);
        System.out.println(restOfMoney);




    }





}
