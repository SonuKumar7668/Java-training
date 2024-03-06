import java.util.*;
public class list1 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Amar");
        list.add("Akbar");
        list.add("Anthony");
        list.remove("Amar");
        list.remove(1);
        System.out.println(list);
        // list.clear();
        list.removeAll(list);
        System.out.println(list);
        System.out.println(list.size());

    }
}
/*
 * Wrie a program to implement vector. add some elements in it multiple times and traverse it;
 * each time to ovserve the behaviour and change in size.
 */