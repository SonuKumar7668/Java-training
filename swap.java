import java.util.Scanner;
public class swap {
    static int x;
    static int y;
    swap( int a,int b){
        x = b;
        y = a;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        x =sc.nextInt();
        y =sc.nextInt();
        swap t = new swap(x,y);
        System.out.println(t.x+" "+t.y);
    }
}
