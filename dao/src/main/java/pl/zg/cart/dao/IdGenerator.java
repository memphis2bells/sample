package pl.zg.cart.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by mb on 2015-02-28 19:58.
 */
public final class IdGenerator {
    private static final Map<Table, AtomicLong> idMap = new ConcurrentSkipListMap<>();

    private IdGenerator() {
    }

    public static Long next(Table table) {
        AtomicLong al = getAtomicLong(table);
        return al.incrementAndGet();
    }

    private static AtomicLong getAtomicLong(Table table) {
        AtomicLong counter = idMap.get(table);
        if (counter == null) {
            final AtomicLong atomicLong = new AtomicLong();
            counter = idMap.putIfAbsent(table, atomicLong);
            if (counter == null) {
                counter = atomicLong;
            }
        }
        return counter;
    }
}
