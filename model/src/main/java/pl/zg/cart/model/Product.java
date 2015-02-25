package pl.zg.cart.model;

import java.math.BigDecimal;

/**
 * Created by mb on 2015-02-25.
 */
public final class Product extends AbstractModel {
    private String name;
    private BigDecimal unitPrice;

    public Product(Long id, String name, BigDecimal unitPrice) {
        super(id);
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public String getName() {
        return name;
    }
}
