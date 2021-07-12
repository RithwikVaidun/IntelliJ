package APCS.Ticket;

public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int num3a, int days) {
        super(num3a,0);
        price = (days >=10) ? 15 : 20;
    }
    public String toString(){
        return "Number: " + num + ", Price: " + price + " (ID required)";
    }
}
