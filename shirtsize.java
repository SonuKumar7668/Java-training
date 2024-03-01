interface Extralarge{
    String extra = "This is extra large shirt.";
    void display();
}
class large{
    public void print(){
        System.out.println("This is large Shirt");
    }
}
class Medium extends large{
    public void print (){
        System.out.println("This is medium shirt.");
    }
}
public class shirtsize extends Medium implements Extralarge {
    public void print(){
        System.out.println("This is small shirt");
    }
    public void display(){
        System.out.println(extra);
    }
    public static void main(String args[]){
        large l = new large();
        Medium m = new Medium ();
        shirtsize s = new shirtsize();
        l.print();
        m.print();
        s.print();
        s.display();

    }
    
}