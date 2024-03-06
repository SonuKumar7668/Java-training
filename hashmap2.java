import java.util.*;
public class hashmap2 {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("sonu",19);
        hm.put("wintr",20);
        hm.put("scar",21);
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry m = (Map.Entry)iterator.next();
            System.out.println("key is "+m.getKey());
            System.out.println("value is "+m.getValue());
        }
    }
}