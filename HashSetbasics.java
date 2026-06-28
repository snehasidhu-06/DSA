import java.util.HashSet;
import java.util.Set;

public class HashSetbasics {

    public static void main(String[] args) {

        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(30);
        System.out.println(st);

        // MEthods
        /*
         * add
         * addAll
         * iterator
         * remove
         * removeAll
         * clear
         * size
         * toArray
         * contains
         * containsAll - returns true if the set contains all the elements of the
         * specified collection
         * hashCode - returns a hashcode value(address of the element of the set)
         * retainall- retains all the elements in the set that are also present in
         * another specified set
         * 
         * 
         * 
         * 
         */

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set2.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(2);
        set2.add(3);
        set2.add(5);
        set2.add(2);
        set2.add(1);

        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set1);
        System.out.println(set2.containsAll(set1));

        /*
         * Why HashSet ?
         * 
         * • In Java, HashSet is commonly used if we have to access elements
         * randomly. It is because elements in a hash table are accessed using hash
         * codes.
         * • The hashcode of an element is a unique identity that helps to identify the
         * element in a hash table.
         * • HashSet cannot contain duplicate elements. Hence, each hash set
         * element has a unique hashcode.
         */

        // linked hashset - to preserve the correct order
        // tree set - sorted
    }

}
