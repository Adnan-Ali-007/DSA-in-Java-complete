import java.util.HashMap;
import java.util.*;
public class hashset {

    //
       public static void main(String[] args) {
//
//creation of hashmap country key,population value
HashMap <String, Integer> map=new HashMap<>();
////insertion
map.put("india",130);
map.put("china",150);
map.put("america",30);
System.out.println(map);
for (Map.Entry<String,Integer> e: map.entrySet()) { //;same as for(int val:arr)
    System.out.println(e.getKey());
System.out.println(e.getValue());
}
map.remove("china");
System.out.println(map);
//            HashSet <Integer> set=new HashSet<>();
//            set.add(2);
//            set.add(1);
//            set.add(4);
//            set.add(2);
//            if(set.contains(1)) {
//                System.out.println("ys");
//            }
//            System.out.println(set);// prints unique elements only
//            //iterator
//            Iterator it=set.iterator();//creating an iterator
//            while(it.hasNext())
//            {
//              System.out.println(it.next());
            }
       }


