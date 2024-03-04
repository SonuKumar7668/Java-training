public class exception {
    public static void main(String [] args){
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("AIOOBE cought  ");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception ");
        }
        catch(Exception e){
            System.out.println("Unwanted Exception. daaaa");
        }
    }
}