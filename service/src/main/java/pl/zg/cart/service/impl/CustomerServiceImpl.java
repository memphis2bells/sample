package pl.zg.cart.service.impl;

import pl.zg.cart.dao.CustomerDao;
import pl.zg.cart.model.Customer;
import pl.zg.cart.service.CustomerService;

/**
 * Created by mb on 2015-02-25 20:14.
 */
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;

    /**
     * Constructor with customer dao.
     *
     * @param customerDao customer dao.
     */
    public CustomerServiceImpl(final CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer register(final Customer customer) {
        return (Customer) customerDao.create(customer);
    }
}
