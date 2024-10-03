package lesson15.domashka;

import java.util.function.Function;

public class CardPredictionFunction implements Function<Integer,String> {
    @Override
    public String apply(Integer integer) {
        if (integer == 1){
            return " Вас непременно ждёт счастье !!! ";
        }
        if (integer == 2){
            return " Доверяйте своим чувствам, интуиция не подведёт... ";
        }
        if (integer == 3){
            return " В этом году вы неожиданно разбогатеете. ";
        }
        return "Упс, у нас только 3 карты...";
    }
}
