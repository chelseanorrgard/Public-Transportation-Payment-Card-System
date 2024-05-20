public class PublicTransportationSystem {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(123456789);
        card.loadMoney(50.0);

        TicketMachine.purchaseSingleTicket(card);
        TicketMachine.purchaseDayTicket(card);
        TicketMachine.purchaseMonthlyTicket(card);
    }
}

class PaymentCard {
    private double balance;

    public PaymentCard(int cardNumber) {
        this.balance = 0;
    }

    public void loadMoney(double amount) {
        balance += amount;
    }

    public double inquireBalance() {
        return balance;
    }

    public void purchaseTicket(Ticket ticket) {
        if (balance >= ticket.getPrice()) {
            balance -= ticket.getPrice();
            System.out.println("Ticket purchased successfully: " + ticket.getTicketType());
        } else {
            System.out.println("Insufficient balance. Please load more money onto your card.");
        }
    }
}

class Ticket {
    private String ticketType;
    private double price;
    private long validityDuration;

    public Ticket(String ticketType, double price, long validityDuration) {
        this.ticketType = ticketType;
        this.price = price;
        this.validityDuration = validityDuration;
    }

    public boolean validate(long currentTimeMillis) {
        return currentTimeMillis < getExpirationTime();
    }

    public long getExpirationTime() {
        return System.currentTimeMillis() + validityDuration;
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getPrice() {
        return price;
    }
}

class TicketMachine {
    public static void purchaseSingleTicket(PaymentCard card) {
        Ticket ticket = new Ticket("Single Ticket", 3.0, 100060602);
        card.purchaseTicket(ticket);
    }

    public static void purchaseDayTicket(PaymentCard card) {
        Ticket ticket = new Ticket("Day Ticket", 8.0, 1000606024);
        card.purchaseTicket(ticket);
    }

    public static void purchaseMonthlyTicket(PaymentCard card) {
        Ticket ticket = new Ticket("Monthly Ticket", 55.0, 100060602430L);
        card.purchaseTicket(ticket);
    }
}
