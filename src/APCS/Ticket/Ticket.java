package APCS.Ticket;

public class Ticket {
    int num;
    double price;

    public double getPrice() {
        return price;
    }
    public Ticket(int num, int price){
        this.num = num;
        this.price = price;
    }
    public Ticket(int n){
        this.num = n;

    }



    public String toString(){
        return "Number: " + num + ", Price: " + price;
    }
}
