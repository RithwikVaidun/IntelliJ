package APCS.Ticket;

public class AdvanceTicket extends Ticket {
    public AdvanceTicket(int num1, int days) {
        super(num1,(days >=10) ? 30 :40);

    }


}
