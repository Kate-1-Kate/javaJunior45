package lesson15.domashka;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class GetAgeSupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        return ThreadLocalRandom.current().nextInt(5, 100 + 1);
    }
}
