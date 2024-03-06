import java.util.HashMap;
public class hashmap {
    public static void main(String args[]){
    HashMap<String,Integer> hm = new HashMap<>();        
    hm.put("hello",12);
    hm.put("mello",10);
    hm.put("mello",10);
    HashMap<String,Integer> hmm = new HashMap<>();
    hmm.put("helloo",123);
    hmm.put("melloo",101);
    System.out.println(hm);
    hm.putAll(hmm);
    System.out.println(hm.size());
    System.out.println(hm.putIfAbsent("hello", 12));
    System.out.println(hm.putIfAbsent("hwello", 142));
    System.out.println(hm);
    hm.remove("melloo",101);
    System.out.println(hm);
    System.out.println(hm.entrySet());
    System.out.println(hm.keySet());
    hm.clear();
    System.out.println(hm.isEmpty());
    System.out.println(hm);
    }
}