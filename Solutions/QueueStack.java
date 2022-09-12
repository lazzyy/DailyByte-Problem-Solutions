import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {

    Queue<Integer> queue;

    public QueueStack() {
        queue = new LinkedList<Integer>();
    }

    public void push(int val) {
        queue.add(val);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }

    public void pop() {
        queue.remove();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        QueueStack stack = new QueueStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.empty());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.empty());
    }
}