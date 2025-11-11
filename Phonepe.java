package SystemDesign;

public class Phonepe {
    int id;
    String name;
    PaymentStatus status;
    public void doPayment(int id,String name){
        if(id>0){
            status=PaymentStatus.SUCCESS;
            System.out.println("payment done");
        }
    }
    public void remAmount(){
        if(status==PaymentStatus.SUCCESS){
            System.out.println("balance check");
        }
    }
}
