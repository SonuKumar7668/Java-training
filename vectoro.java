import java.util.*;

public class vectoro {
    public static void main(String args[]){
        Vector<Integer> ve = new Vector<Integer>();
        ve.add(52);
        ve.add(54);
        ve.add(54);
        ve.add(54);
        ve.add(54);
        ve.add(54);
        ve.add(54);
        ve.add(54);
        ve.add(54);
        ve.add(54);
        ve.add(23);
        ve.addAll(ve);
        System.out.println(ve);
        System.out.println(ve.capacity());
        System.out.println(ve.size());
    }
}