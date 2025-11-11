package SystemDesign;

public class RazorpayAdap implements PaymentGateway{
    Razorpay razorpay=new Razorpay();
    public void makePayment(int id,String name){
        razorpay.doTransaction(id,name);
    }
}