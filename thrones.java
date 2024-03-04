public class thrones {
    void out() throws Exception {
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("hello");
        }
    }
    public static void main(String args[]){
        thrones ob = new thrones();
        ob.out();
    }
}
