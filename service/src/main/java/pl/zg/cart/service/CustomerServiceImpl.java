package pl.zg.cart.service;

import pl.zg.cart.dao.CustomerDao;
import pl.zg.cart.model.Customer;

/**
 * Created by mb on 2015-02-25 20:14.
 */
public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao customerDao;

    public CustomerServiceImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer register(Customer customer) {
        return (Customer) customerDao.create(customer);
    }
}
