package pl.zg.cart.model;

/**
 * Created by mb on 2015-02-25 20:20.
 */
public abstract class AbstractModel<K, T> {
    private final K id;

    /**
     * Constructor.
     *
     * @param id
     */
    public AbstractModel(final K id) {
        this.id = id;
    }

    public K getId() {
        return id;
    }

    /**
     * Builds object from giver object t and sets object id.
     *
     * @param key new object key
     * @param t object which will be use to build new one
     * @return Object with new id.
     */
    public abstract T build(final K key, final T t);

    @Override
    public String toString() {
        return "AbstractModel{" +
                "id=" + id +
                '}';
    }
}
