import java.util.*;
public class vectoro1 {
    public static void main(String args[]){
        Vector<Integer> ve = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int a = sc.nextInt();
            ve.add(a);
        }
        // System.out.println(ve.size());
        int s = ve.size();
        for (int i=0;i<s;i++){
            System.out.println(ve.get(i));
        }
    }
}