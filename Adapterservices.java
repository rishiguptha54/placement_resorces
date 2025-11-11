package SystemDesign;

public class Adapterservices {
    public static void main(String[] args) {
        PaymentGateway pg=new RazorpayAdap();
        PaymentGateway pg1=new PhonepeAdap();
        pg.makePayment(45,"rishi"); 
        
        pg1.checkBalance(45,"rishi");
    }
}
