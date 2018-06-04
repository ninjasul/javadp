package chap06.singleton._06.ex02;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int THREAD_NUM = 15;
    private static int MAX_THREAD_COUNT = 5;

    public static void main(String[] args) {
        List<UserThread> userThreadList = new ArrayList<UserThread>();
        TicketIssuer.setMaxTicketSerialNo(MAX_THREAD_COUNT);

        for( int i = 0; i < THREAD_NUM; ++i ) {
            UserThread thread = new UserThread("Thread-"+(i+1));
            userThreadList.add(thread);
            thread.start();
        }

        for( UserThread curThread : userThreadList ) {
            try {
                curThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for( UserThread curThread : userThreadList ) {
            if( curThread.getTicketNum() != 0 ) {
                System.out.println(curThread.getName() + ": " + curThread.getTicketNum());
            }
        }
    }
}