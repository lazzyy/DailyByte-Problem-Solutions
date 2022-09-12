import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CallCounter {

    Queue<Integer> queue;

    public CallCounter() {
        queue = new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        CallCounter cc = new CallCounter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter t : ");
        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            System.out.println("No. of Pings within the last 3 seconds : " + cc.ping(t));
            System.out.print("Enter t : ");
        }
        sc.close();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}