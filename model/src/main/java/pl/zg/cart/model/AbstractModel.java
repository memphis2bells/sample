package pl.zg.cart.model;

/**
 * Created by mb on 2015-02-25 20:20.
 */
public abstract class AbstractModel {
    private final Long id;

    public AbstractModel(Long id) {
        this.id = id;
    }

    protected Long getId() {
        return id;
    }

}
