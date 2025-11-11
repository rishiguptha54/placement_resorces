package SystemDesign;

public class PhonepeAdap implements PaymentGateway{
    Phonepe phonepe=new Phonepe();
    void makePayment(){
        phonepe.doPayment();
    }
    void checkBalance(){
        phonepe.remAmount();
    }
}
