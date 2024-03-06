import java.util.*;
public class queue {
    public static void main(String args[]){
        PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++){
            int a=sc.nextInt();
            qu.add(a);
        }
        System.out.println(qu);
        System.out.println(qu.remove());
        System.out.println(qu.element());
        System.out.println(qu.peek());
        System.out.println(qu);
    }
}