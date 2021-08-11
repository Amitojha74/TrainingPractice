package Search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchTest {

    public static void main(String[] args){
        Searching s=new Searching();
        List<Searching> list=new ArrayList<>();
        list.add(new Searching(101,"AM","OJ"));
        list.add(new Searching(102,"ojjjj","Amit"));
        list.add(new Searching(103,"ojj","Amit"));
        list.add(new Searching(104,"ojj","OJ"));
        System.out.println(list);
        List l=list.stream().filter(name->"ojj".equals(s.getName())).collect(Collectors.toList());
        System.out.println(l);
    }
}
