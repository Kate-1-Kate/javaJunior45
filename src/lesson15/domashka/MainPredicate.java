package lesson15.domashka;

public class MainPredicate {
    public static void main(String[] args) {
        int olyaAge = 23;
        int vasyaAge = 18;
        int romaAge = 11;

        System.out.println("Можно ли этому человеку продать алкоголь ?");

        System.out.println(new ChekingAgeOfMajorityPredicate().test(olyaAge));
        System.out.println(new ChekingAgeOfMajorityPredicate().test(vasyaAge));
        System.out.println(new ChekingAgeOfMajorityPredicate().test(romaAge));







    }
}
