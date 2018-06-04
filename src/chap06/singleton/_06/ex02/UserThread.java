package chap06.singleton._06.ex02;

public class UserThread extends Thread {
    private int ticketNum;

    public UserThread(String name) {
        super(name);
    }

    public void run() {
        ticketNum = TicketIssuer.issueTicket();
        //System.out.println( this.getName() + " - ticketNum : " + ticketNum);
    }

    public int getTicketNum() {
        return ticketNum;
    }
}