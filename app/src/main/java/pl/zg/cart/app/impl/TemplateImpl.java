package pl.zg.cart.app.impl;


import org.apache.log4j.Logger;
import pl.zg.cart.app.Template;
import pl.zg.cart.app.generator.CustomerGenerator;
import pl.zg.cart.dao.impl.CustomerDaoImpl;
import pl.zg.cart.model.Customer;
import pl.zg.cart.service.CustomerService;
import pl.zg.cart.service.impl.CustomerServiceImpl;

/**
 * Created by mb on 2015-02-28 22:46.
 */
public class TemplateImpl implements Template {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(TemplateImpl.class);

    /**
     * Customer service.
     */
    private final CustomerService customerService;

    /**
     * Default constructor.
     */
    public TemplateImpl() {
        this.customerService = new CustomerServiceImpl(new CustomerDaoImpl());
    }

    @Override
    public void register() {
        Customer customer = CustomerGenerator.generate();
        customer = customerService.register(customer);
        LOGGER.debug(String.format("Customer %s %s has been registered.", customer.getFirstName(), customer.getLastName()));
        LOGGER.debug(customer);
    }
}
