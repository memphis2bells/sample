package pl.zg.cart.dao;

import pl.zg.cart.model.AbstractModel;

/**
 * Created by mb on 2015-02-25 20:45.
 */
public interface CrudDao<K, T extends AbstractModel> {
    T create(T t);
    T read(K key);
    int update(T t);
    int delete(K key);
}
