package SystemDesign;

Interface Transaction{
    void doTransaction();
    void remBalance();
}
static class Phonepe{
    void doPayment(){
        System.out.println("payment done");
    }
    void checkBalance(){
        System.out.println("balance check");
    }
}

static class Razorpay{
    void makePayment(){
        System.out.println("payment done");
    }
    void remAmount(){
        System.out.println("balance check");
    }
}
public PhonepeAdap implements Transaction {
    Phonepe phonepe=new Phonepe();
    void doTransaction(){
        phonepe.doPayment();
    }
    void remBalance(){
        phonepe.checkBalance();
    }
}

public RazorpayAdap implements Transaction{
    Razorpay rpy=new Razorpay();
    void doTransaction(){
        rpy.makePayment();
    }
    void remBalance(){
        rpy.remAmount();
    }
}


public class Flipkart{
    public static void main(String[] args) {
        PhonepeAdap pa=new PhonepeAdap();
        pa.doTransaction();
        pa.remBalance();
    }
}