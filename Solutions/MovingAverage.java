import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovingAverage {

    Queue<Integer> queue;
    int maxSize;
    double sum;

    public MovingAverage(int capacity) {
        queue = new LinkedList<Integer>();
        maxSize = capacity;
        sum = 0.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of the Moving Average : ");
        int capacity = sc.nextInt();
        MovingAverage movingAverage = new MovingAverage(capacity);
        System.out.print("Enter val : ");
        while (sc.hasNextInt()) {
            int val = sc.nextInt();
            System.out.println("Moving Average = " + movingAverage.next(val));
            System.out.print("Enter val : ");
        }
        sc.close();
    }

    public double next(int val) {
        if (queue.size() == maxSize) {
            sum -= queue.remove();
        }
        queue.add(val);
        sum += val;
        return sum / queue.size();
    }
}