package pl.zg.cart.app;

import pl.zg.cart.app.impl.TemplateImpl;

/**
 * Main class for the Simple Cart Application.
 * <p>
 * Created by mb on 2015-02-24.
 */
public class CartApp {
    /**
     * Application template.
     */
    private final TemplateImpl template;

    /**
     * Default constructor.
     */
    public CartApp() {
        template = new TemplateImpl();
        start();
    }

    /**
     * Starts sample application.
     *
     * @param args program params
     */
    public static void main(final String... args) {
        new CartApp();
    }

    private void start() {
        template.register();
    }


}
