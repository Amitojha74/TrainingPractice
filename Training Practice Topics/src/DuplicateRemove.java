import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Amit");
        Employee e2 = new Employee(1,"Amit");
        Employee e3 = new Employee(2,"Ankit");
        Employee e4 = new Employee(3,"Aman");
        Employee e5 = new Employee(3,"Aman");
        Employee e6 = new Employee(3,"Aman");
        Employee e7 = new Employee(4,"Ankit");
        Employee e8 = new Employee(2,"Ankit");

        List<Employee> list=new ArrayList<>();
        list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);list.add(e6);list.add(e7);
        list.add(e8);

        Set<Employee> set=new HashSet<>();
        set.add(e1);set.add(e2);set.add(e3);set.add(e4);set.add(e5);set.add(e6);set.add(e7);set.add(e8);
        System.out.println("Before Remove Duplicate: ");
        System.out.println(list);

        System.out.println("After Remove Duplicate: ");
        System.out.println(set);
    }

}
