package pl.zg.cart.dao;

import pl.zg.cart.model.AbstractModel;

/**
 * Created by mb on 2015-02-25 20:45.
 */
public interface CrudDao<K, T extends AbstractModel> {
    /**
     * Creates new object.
     *
     * @param t object intended to store.
     * @return
     */
    T create(T t);

    /**
     * Reads object by key.
     *
     * @param key object key
     * @return Retrieved object.
     */
    T read(K key);

    /**
     * Updates object.
     *
     * @param t object to update
     */
    void update(T t);

    /**
     * Deletes object.
     *
     * @param key object key
     */
    void delete(K key);
}
