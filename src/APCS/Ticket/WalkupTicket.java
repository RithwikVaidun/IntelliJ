package APCS.Ticket;

public class WalkupTicket extends Ticket {

    public WalkupTicket(int num1) {
        super(num1,50);
    }
    public double getPrice(){
        return 50;
    }

}
