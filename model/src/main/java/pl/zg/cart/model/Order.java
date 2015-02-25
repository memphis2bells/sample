package pl.zg.cart.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mb on 2015-02-25 19:40.
 */
public final class Order extends AbstractModel {
    private final BigDecimal shippingCost;
    private final Date orderDate;
    private final Customer customer;
    private final List<OrderItem> orderItems = new ArrayList<>();

    public Order(Long id, BigDecimal shippingCost, Date orderDate, Customer customer) {
        super(id);
        this.shippingCost = shippingCost;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public BigDecimal getShippingCost() {
        return shippingCost;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Customer getCustomer() {
        return customer;
    }
}
