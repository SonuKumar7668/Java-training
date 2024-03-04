import java.util.Scanner;
public class agegroup {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:- ");
        int n = sc.nextInt();
        if(n>=18){
            throw new ArithmeticException("Eligible for vote");
        }else{
            throw new ArithmeticException("Note eligible for vote");
        }
    }
}
