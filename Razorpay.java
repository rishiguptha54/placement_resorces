package SystemDesign;

public class Razorpay {
    int id;
    String name;
    PaymentStatus status;
    Razorpay(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void doTransaction(int id,String name){
        if(id>0){
            status=PaymentStatus.SUCCESS;
            System.out.println("payment done");
        }
    }
}
