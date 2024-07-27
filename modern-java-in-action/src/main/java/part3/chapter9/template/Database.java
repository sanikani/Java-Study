package part3.chapter9.template;

public class Database {
    public static Customer getCustomerWithId(int id) {
        return new Customer(id, "example");
    }
}
