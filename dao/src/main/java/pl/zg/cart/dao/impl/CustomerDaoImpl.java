package pl.zg.cart.dao.impl;

import pl.zg.cart.dao.AbstractDao;
import pl.zg.cart.dao.CustomerDao;
import pl.zg.cart.dao.ObjectType;
import pl.zg.cart.model.Customer;

/**
 * Created by mb on 2015-02-25 20:44.
 */
public class CustomerDaoImpl extends AbstractDao<Long, Customer> implements CustomerDao<Long, Customer> {

    public CustomerDaoImpl() {
        super(ObjectType.CUSTOMER);
    }
}
