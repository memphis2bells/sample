package pl.zg.cart.model;

/**
 * Created by mb on 2015-02-25 20:21.
 */
public final class Customer extends AbstractModel<Long, Customer> {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String email;

    private Customer(CustomerBuilder cb) {
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
    public Customer build(Long key, Customer customer) {
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

    public static class CustomerBuilder {
        private Long id;
        private String firstName;
        private String lastName;
        private String city;
        private String email;

        public CustomerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder city(String city) {
            this.city = city;
            return this;
        }

        public CustomerBuilder email(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder fill(Customer customer) {
            this.id = customer.getId();
            this.firstName = customer.getFirstName();
            this.lastName = customer.getLastName();
            this.city = customer.getCity();
            this.email = customer.getEmail();
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
