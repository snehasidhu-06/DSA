import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(30);
        pq.add(10);

        System.out.println(pq);

        // default behaviour -> Integers -> less value -> high priority

        System.out.println(pq.poll());
        System.out.println(pq);

    }

}
