import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class cf2 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);

        // remove
        list.remove(1);

        // get
        System.out.println(list.get(0));

        // set
        list.set(0, 100);

        // contains
        System.out.println(list.contains(100));

        // size
        System.out.println(list.size());

        // iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // sort
        Collections.sort(list);

        System.out.println(list);

        // add first and add last

        list.add(56);
        list.add(78);

        System.out.println(list);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(1);
        ll.add(102);

        System.out.println(ll);

        ll.addFirst(109);
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.getFirst()); // returns the first eleemnt similarly get last

        // peek()- returns the head of linked list
        // poll()- returns and remove the first elemennt from the linked list
        // offer()- adds the specified element at the end of the linked list - same as
        // add last

        System.out.println(ll.poll());
        System.out.println(ll);

        // Vectors - less efficient than arrayList

        Vector<Integer> vector = new Vector<>(); // creation of vector
        // vector doesnt work for linked lists

        // JAVA STACK

        Stack<Integer> stack = new Stack<>(); // Integer type Stack

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search(10));

    }
}