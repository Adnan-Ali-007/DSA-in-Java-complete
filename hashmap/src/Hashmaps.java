import java.util.HashMap;
import java.util.*;
public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("adnan",67);
        mp.put("saqib",43);
        System.out.println(mp.get("adnan"));
        System.out.println(mp.containsKey("adnan"));
        HashSet<Integer>set=new HashSet<>();
        set.add(65);
        set.add(652);
        set.add(651);
        //set.conmatisn for checking is or nt
        //hashmap iertaion
        for(mp.Entry<String,Integer>e:mp.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue);
        }
        //iterator
        Iterator it=set.iterator(); //forb traversing the set
        //hasnxt,nxt
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set);
    }
}
