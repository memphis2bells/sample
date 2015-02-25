package pl.zg.cart.model;

import java.math.BigDecimal;

/**
 * Created by mb on 2015-02-25 20:21.
 */
public final class OrderItem extends AbstractModel {
    private final BigDecimal price;
    private final int quantity;
    private final Order order;

    public OrderItem(Long id, BigDecimal price, int quantity, Order order) {
        super(id);
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }
}
