import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeBasics {

    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offerFirst(20);
        q.offerLast(30);

        System.out.println(q);

        q.pollLast();
        q.pollFirst();
        q.peek(); // First and Last both possible
    }

}
