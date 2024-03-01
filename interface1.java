interface Samplel{
    int show(int x);
}
interface Demo extends Sample{
    void out();
}
interface Test extends Demo {
    void display();
}
public class interface1 implements Test{
    public int show(int x){
        return x;
    }
    public void out(){
        System.out.println("Out function");
    }
    public void display(){
        System.out.println("Display function.");
    }
    public static void main(String args[]){
        interface1 ob = new interface1();
        System.out.println(ob.show(34));
        ob.out();
        ob.display();
    }
    
}
