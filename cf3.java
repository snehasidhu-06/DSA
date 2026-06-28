import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class cf3 {

    public static void main(String[] args) {

        // Queue

        Queue<Integer> q = new LinkedList<>();
        /*
         * q.add(10);
         * q.add(20);
         * q.add(30);
         */

        // Offer - Inserts the specified element into the queue. If the task is
        // successful,offer() returns true, if not it returns false
        // in case of add it returns exception

        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

        // element()- returns the head of the queue, throw wxception if queue is empty
        /// peek()- same but returns null if empty

        // remove()- returns and remove the head of the queue, throw an exception if the
        // queue is empty.
        // poll()- same but returns null if queue is empty

        Deque<Integer> d = new LinkedList();
        // available - addfirst addlast getfirst getlast :

        // Array implementation of queue
        Queue<String> s = new ArrayDeque<>();

        // Priority queue implementation
        Queue<String> a = new PriorityQueue<>();

    }
}
