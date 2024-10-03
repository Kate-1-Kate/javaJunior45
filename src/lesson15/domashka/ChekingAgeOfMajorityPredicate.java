package lesson15.domashka;

import java.util.function.Predicate;

public class ChekingAgeOfMajorityPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if (integer < 18){
            return false;
        }
        return true;
    }


}
