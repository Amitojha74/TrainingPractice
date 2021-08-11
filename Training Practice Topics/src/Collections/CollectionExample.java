package Collections;

import java.util.*;

class CollectionExample {

    public static void main(String[] args) {

        Set set = new HashSet();
        //Set set=new TreeSet();
        SetOperations(set);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(6);
        SetOperations(set);

        Map<Integer, String> map = new HashMap<>();
        //Map<Integer, String> map = new TreeMap<>();
        //Map<Integer, String> map = new Hashtable<>();
        MapOperation(map);
        map.put(1,"Amit");
        map.put(2,"Aman");
        MapOperation(map);

        //List list=new LinkedList();
        List list=new ArrayList();
        ListOperations(list);
        list.add(2);
        list.add(4);
        list.add(5);
        ListOperations(list);
    }

    private static void ListOperations(List list) {
        if(list.isEmpty())
            System.out.println("List is empty");
        else{
            System.out.println(list);
            int a= (int)list.get(2);
            System.out.println(a);

        }
    }

    private static void MapOperation(Map<Integer, String> map) {
        if(map.isEmpty())
            System.out.println("Map is empty");
        else {
            System.out.println(map);
            if (map.containsKey(1)) {
                String a = map.get(1);
                int size = map.size();
                System.out.println("Value of key 1 is: " + a);
                System.out.println("Size of the map is: " + size);
            }
        }
        map.clear();     //empty the map
        System.out.println(map);
    }

    private static void SetOperations(Set set){
        if(set.isEmpty())
            System.out.println("Set is Empty");
        else{
            System.out.println(set);
        }
    }
}
