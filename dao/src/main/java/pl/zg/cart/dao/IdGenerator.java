package pl.zg.cart.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by mb on 2015-02-28 19:58.
 */
public final class IdGenerator {
    private static final Map<ObjectType, AtomicLong> idMap = new ConcurrentSkipListMap<>();

    private IdGenerator() {
    }

    public static Long next(final ObjectType objectType) {
        final AtomicLong al = getAtomicLong(objectType);
        return al.incrementAndGet();
    }

    private static AtomicLong getAtomicLong(final ObjectType objectType) {
        AtomicLong counter = idMap.get(objectType);
        if (counter == null) {
            final AtomicLong atomicLong = new AtomicLong();
            counter = idMap.putIfAbsent(objectType, atomicLong);
            if (counter == null) {
                counter = atomicLong;
            }
        }
        return counter;
    }
}
