package pl.zg.cart.model;

/**
 * Created by mb on 2015-02-25 20:20.
 */
public class ShoppingCartItem extends AbstractModel {
    private final int quantity;
    private final ShoppingCart shoppingCart;
    private final Product product;
    private final Order order;

    public ShoppingCartItem(Long id, int quantity, ShoppingCart shoppingCart, Product product, Order order) {
        super(id);
        this.quantity = quantity;
        this.shoppingCart = shoppingCart;
        this.product = product;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public int getQuantity() {
        return quantity;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Product getProduct() {
        return product;
    }

}
