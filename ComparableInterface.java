import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ComparableInterface {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(19, "Viky", 67));
        students.add(new Student(23, "love", 63));
        students.add(new Student(29, "Vinu", 65));
        students.add(new Student(17, "miky", 57));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

        /*
         * list.add(15);
         * list.add(8);
         * list.add(2);
         * list.add(90);
         * 
         * System.out.println(list);
         * 
         * Collections.sort(list);
         * System.out.println(list);
         */

    }

}
