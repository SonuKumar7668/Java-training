//write a java program to  check the exception in expression calculation 
//1.negative interger.
//2.divide by zero.
public class negativeexception {
    public static void main(String args[]){
        try{
            System.out.println(10/-2);
        }
        catch(Exception e){
            System.out.println("this is not expected.");
        }
        try{
            System.out.println(10/-2);
        }
        catch(ArithmeticException e){
            System.out.println("this is not expected.");
        }
    }
}