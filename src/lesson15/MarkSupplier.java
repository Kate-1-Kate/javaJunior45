package lesson15;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class MarkSupplier implements Supplier<Integer> {
    @Override
    public Integer get() {
        return ThreadLocalRandom.current().nextInt(2, 5 + 1);
    }
}
