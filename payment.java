public class payment {
    public static void main(String[] args) {
        Bill objStul = new Bill("bill_type", 70);
        objStul.display();
    }
    
}

public class Bill {
    private String bill_type;
    private int bill_lastUnit;
    private int bill_currentUnit;
    private double bill_result;

    public Bill(String type,int lastUnit){

    }
    public int getbill_currentUnit(){
        return bill_currentUnit;
    }
    public void setbill_currentUnit(){
        if(bill_lastUnit<bill_currentUnit){
        }
    }
    public int calculateUnit(){
        
        return bill_result;
    }

    public void display(){
        System.out.println("“My payment bill is : "+ bill_type+"\n"+"The result is : "+calculateUnit());
    }

    
}
