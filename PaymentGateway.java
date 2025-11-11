package SystemDesign;

public interface PaymentGateway {

    void makePayment(int id,String name);
    void checkBalance(int id,String name);
}
