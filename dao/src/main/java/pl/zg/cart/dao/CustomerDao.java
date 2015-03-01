package pl.zg.cart.dao;

import pl.zg.cart.model.AbstractModel;

/**
 * Created by mb on 2015-02-25 20:44.
 */
public interface CustomerDao<K, T extends AbstractModel> extends CrudDao<K, T> {
}
