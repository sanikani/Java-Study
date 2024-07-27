package part3.chapter9.template;

import java.util.function.Consumer;

public class Bank1 extends OnlineBanking{
    @Override
    void makeCustomerHappy(Customer c) {
        System.out.println(c.getName()+"안녕하세요");
    }

    public static void main(String[] args) {
        Bank1 bank1 = new Bank1();
        bank1.processCustomer(12);

        //람다 표현식 사용
        Bank1.processCustomer(12, c -> System.out.println("Hello" + c.getName()));
    }

    public static void processCustomer(int id, Consumer<Customer> makeCustomerHappy) {
        Customer c = Database.getCustomerWithId(id);
        makeCustomerHappy.accept(c);
    }
}
