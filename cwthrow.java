public class cwthrow {
    public static int divice(int a,int b) throws ArithmeticException{
        int result;
        try{
            result = a/b;
            return result;
        }
        catch(ArithmeticException e){
            System.out.println("It can not Run.");
            return 0;
        }
        
    }
    public static void main(String a[]){
        int c = divice(6,0);
        System.out.println(c);
    }
}