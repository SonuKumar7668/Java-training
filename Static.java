public class Static {
    static {
        System.out.println("static block executed first");
    }
    public static void main(String args[]){
        System.out.println("main methon executed after");
    }
}
