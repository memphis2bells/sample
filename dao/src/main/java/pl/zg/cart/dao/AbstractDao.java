package pl.zg.cart.dao;

import pl.zg.cart.model.AbstractModel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mb on 2015-02-25 20:49.
 */
public class AbstractDao<K, T extends AbstractModel<K, T>> implements CrudDao<K, T> {

    /**
     * Map repository for storing objects.
     */
    private final Map<K, T> repo = new ConcurrentHashMap<>();

    private final Table table;

    protected AbstractDao(Table table) {
        this.table = table;
    }

    @Override
    public T create(T t) {
        T build = t.build((K)IdGenerator.next(table), t);
        repo.put(build.getId(), build);
        return build;
    }

    @Override
    public int update(T t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T read(K key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int delete(K key) {
        throw new UnsupportedOperationException();
    }
}
