public class Student implements Comparable<Student> {
    /**
     * Comparable Interface:
     * 
     * - Purpose: Defines a natural ordering for the objects of the classes that
     * implement it.
     * - Method to Implement: compareTo(T o)
     * - Functionality: This method compares the current object with the specified
     * object to
     * determine their order.
     * - Return Value: Returns a negative integer, zero, or a positive integer as
     * this object is less
     * than, equal to, or greater than the specified object, respectively.
     * - Usage Context: Useful when there is a single, natural ordering of the
     * objects (e.g.,
     * alphabetical order for strings, numerical order for numbers).
     * - Integration: Automatically used by sorting methods in collections that do
     * not specify a
     * custom comparator (e.g., Collections.sort(list) when sorting a list of
     * objects that implement
     * Comparable).
     */

    public int age;
    public String name;
    public int weight;

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;

    }

    @Override
    public int compareTo(Student that) {
        // this method is called for current object
        // we will define our sorting logic here

        // Sort basis on age

        return this.age - that.age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.weight;
    }

}
