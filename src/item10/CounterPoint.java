package item10;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point{
    private static final AtomicInteger count = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        count.incrementAndGet();
    }

    public static int numberCreated() {
        return count.get();
    }

}
