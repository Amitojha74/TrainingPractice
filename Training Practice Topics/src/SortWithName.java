import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortWithName {
    public static void main(String[] args) {

        Student e1 = new Student(1, "Naman", 20, "Noida");
        Student e2 = new Student(2, "Amit", 27, "Kanpur");
        Student e3 = new Student(3, "Manmohan", 30, "Delhi");
        Student e4 = new Student(4, "Sita", 23, "Gurugram");
        Student e5 = new Student(5, "Aman", 22, "Pune");
        Student e6 = new Student(6, "Gagan", 21, "Mumbai");
        Student e7 = new Student(7, "Dheeraj", 25, "Kanpur");

        List<Student> students = new ArrayList<>();
        students.add(e1);
        students.add(e2);
        students.add(e3);
        students.add(e4);
        students.add(e5);
        students.add(e6);
        students.add(e7);

        System.out.println("Original List");
        System.out.println(students);
        Collections.sort
                (students, new Student());
        System.out.println();
        System.out.println("After Sort By Name The List Is");
        System.out.println(students);

    }
}
