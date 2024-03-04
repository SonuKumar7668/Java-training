public class throws2 {
    void method1(){
        System.out.println(10/0);
    }
    public static void main(String args[]){
        throws2 ob = new throws2();
        try{
            ob.method1();
        }catch(ArithmeticException e){
            System.out.println("Arithmetic operation.");
        }
    }
}