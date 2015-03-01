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

    /**
     * Object type.
     */
    private final ObjectType objectType;

    /**
     * Constructor with object type param.
     *
     * @param objectType object type
     */
    protected AbstractDao(final ObjectType objectType) {
        this.objectType = objectType;
    }

    @Override
    public T create(final T t) {
        final T build = t.build((K) IdGenerator.next(objectType), t);
        repo.put(build.getId(), build);
        return build;
    }

    @Override
    public void update(final T t) {
        repo.put(t.getId(), t);
    }

    @Override
    public T read(final K key) {
        return repo.get(key);
    }

    @Override
    public void delete(final K key) {
        repo.remove(key);
    }
}
