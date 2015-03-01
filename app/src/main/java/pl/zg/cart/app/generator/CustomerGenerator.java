package pl.zg.cart.app.generator;

import pl.zg.cart.model.Customer;

import java.util.Random;

/**
 * Created by mb on 2015-02-25 20:21.
 */
public final class CustomerGenerator {
    public static final String[] FIRST_NAME = {"Stefan", "Karol", "Jan"};
    public static final String[] LAST_NAME = {"Batory", "Cukierek", "Wielki"};
    public static final String[] EMAIL = {"gmail.com", "onet.pl", "wp.pl"};
    public static final String[] CITY = {"Katowice", "Warszawa", "Opole"};

    private CustomerGenerator() {
    }

    /**
     * Generate new Customer object.
     *
     * @return Created object.
     */
    public static Customer generate() {
        final String firstName = FIRST_NAME[new Random().nextInt(FIRST_NAME.length)];
        final String lastName = LAST_NAME[new Random().nextInt(LAST_NAME.length)];
        final String email = EMAIL[new Random().nextInt(EMAIL.length)];
        final String city = CITY[new Random().nextInt(CITY.length)];
        return new Customer.CustomerBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .email(String.format("%s.%s@%s", firstName.toLowerCase(), lastName.toLowerCase(), email))
                .city(city)
                .build();
    }
}
