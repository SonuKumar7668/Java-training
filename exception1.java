import java.util.Scanner;
public class exception1 {
    public static void main(String args[]){
        String s = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int a = sc.nextInt();
        try{
            System.out.println(10/a);
            try{
                System.out.println(s.length());

            }
            catch(Exception e){
                System.out.println("gotch you bitch.");
            }
        }
        catch(Exception e){
            System.out.println("Exception cought");
        }
        finally{
            System.out.println("shitt.");
        }
    }
    
}
