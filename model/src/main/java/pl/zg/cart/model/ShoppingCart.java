package pl.zg.cart.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mb on 2015-02-25.
 */
public final class ShoppingCart extends AbstractModel {
    private final Customer customer;
    private final List<ShoppingCartItem> shoppingCartItems = new ArrayList<>();

    public ShoppingCart(Long id, Customer customer) {
        super(id);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<ShoppingCartItem> getShoppingCartItems() {
        return shoppingCartItems;
    }
}
