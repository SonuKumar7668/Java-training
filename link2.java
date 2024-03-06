import java.util.*;

public class link2 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("ssd");
        list.add("hdd");
        list.clear();
        list.remove("ssd");
        System.out.println(list);
    }
}