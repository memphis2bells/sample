package pl.zg.cart.model;

/**
 * Created by mb on 2015-02-25 20:20.
 */
public abstract class AbstractModel<K, T> {
    private final K id;

    public AbstractModel(K id) {
        this.id = id;
    }

    public K getId() {
        return id;
    }

    public abstract T build(K key, T t);

    @Override
    public String toString() {
        return "AbstractModel{" +
                "id=" + id +
                '}';
    }
}
