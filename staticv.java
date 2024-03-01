public class staticv {
    static int x,y;
    static void show(){
        System.out.println("x= "+x+" "+"y= "+y);

    }
    public static void main(String args[]){
        staticv ob = new staticv();
        x=10;
        y=20;
        show();
    }
}
