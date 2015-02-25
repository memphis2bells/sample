package pl.zg.cart.model;

import java.util.List;

/**
 * Created by mb on 2015-02-25 20:21.
 */
public final class Customer extends AbstractModel {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String email;
    private List<ShoppingCart> shoppingCarts;
    private List<Order> orders;

    public Customer(Long id, String firstName, String lastName, String city, String email) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
    }

    public List<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }
}
