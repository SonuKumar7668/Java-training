import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String args[]){
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int a= sc.nextInt();
            st.push(a);
        }
        st.pop();
        System.out.println(st.peek());
        int s = st.size();
        for (int i=0;i<s;i++){
            System.out.println(st.get(i));
        }
        st.empty();
        System.out.println(st.empty());
        System.out.println(search());
    }
}