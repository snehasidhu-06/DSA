import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class cf {

    public static void main(String[] args) {
        // List or collection -> interface

        // ArrayLIst -> concrete class

        // TO create list - 3 ways
        ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // remove
        list.remove(1);
        System.out.println(list);

        // addAll

        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);
        list.addAll(list2);
        System.out.println(list);

        // removeAll

        list.removeAll(list2);
        System.out.println(list);

        // to check the size

        System.out.println(list.size());

        // to clear

        /*
         * list.clear();
         * System.out.println(list.size());
         */
        // Iterator
        // to traverse list

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            System.out.println("element: " + iterator.next());

        }
        // get & set
        List<Integer> list3 = new ArrayList<>();

        list3.add(11);
        list3.add(17);
        list3.add(18);
        System.out.println(list3.get(1));

        list3.set(0, 100);
        System.out.println(list3);

        // toArray -> convert a list to array

        list3.toArray();
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);

        }

        // contains-> true or false

        System.out.println(list3.contains(100));

        list.add(5);
        list.add(12);
        System.out.println("printing entire list : " + list);

        // sort

        Collections.sort(list);
        System.out.println("After sorting : " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("desecnding order: " + list);

        // clone()-> creates a new arraylist with the same element,size and capacity->
        // shallow copy not deep copy

        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();

        System.out.println(newList);

        // ensureCapacity()-> Specifies the total element the arrayList can contain

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        // isEmpty()-True & False
        System.out.println(newList.isEmpty());

        // indexOf()

        System.out.println(newList.indexOf(5));

        //  Linked List - same as above except clone - clonong is not possible like above
 // lastIndexOf(o:30)
 


    }
}