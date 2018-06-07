package chap06.singleton._06.ex02;

public class TicketIssuer {
    private static int serialNo = 0;
    private static int maxTicketSerialNo;

    public static int issueTicket() {
        if( serialNo < maxTicketSerialNo ) {
            return ++serialNo;
        }
        else {
            return 0;
        }
    }

    public static void setMaxTicketSerialNo( int number ) {
        maxTicketSerialNo = number;
    }

}