package pl.zg.cart.model;

import java.io.Serializable;

/**
 * Created by mb on 2015-02-25 20:21.
 */
public final class Customer extends AbstractModel<Long, Customer> implements Serializable {
    private static final long serialVersionUID = 2208036358645693012L;
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String email;

    /**
     * Constructor.
     *
     * @param cb customer builder
     */
    private Customer(final CustomerBuilder cb) {
        super(cb.id);
        this.firstName = cb.firstName;
        this.lastName = cb.lastName;
        this.city = cb.city;
        this.email = cb.email;
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

    @Override
    public Customer build(final Long key, final Customer customer) {
        return new CustomerBuilder().fill(customer).id(key).build();
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Customer builder.
     */
    public static class CustomerBuilder {
        private Long id;
        private String firstName;
        private String lastName;
        private String city;
        private String email;

        public CustomerBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder id(final Long id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder city(final String city) {
            this.city = city;
            return this;
        }

        public CustomerBuilder email(final String email) {
            this.email = email;
            return this;
        }

        /**
         * Fills builder fields.
         *
         * @param customer object which will be use to fill new one
         * @return Customer builder object with filled fields.
         */
        public CustomerBuilder fill(final Customer customer) {
            this.id = customer.getId();
            this.firstName = customer.getFirstName();
            this.lastName = customer.getLastName();
            this.city = customer.getCity();
            this.email = customer.getEmail();
            return this;
        }

        /**
         * Builds new object.
         *
         * @return New object.
         */
        public Customer build() {
            return new Customer(this);
        }
    }
}
