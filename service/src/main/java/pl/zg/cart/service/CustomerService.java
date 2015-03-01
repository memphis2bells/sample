package pl.zg.cart.service;

import pl.zg.cart.model.Customer;

/**
 * Created by mb on 2015-02-25 20:14.
 */
public interface CustomerService {

    /**
     * Register new customer.
     *
     * @param customer Customer.
     * @return Customer with new id.
     */
    Customer register(Customer customer);
}
