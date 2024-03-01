interface Sample {
    void show(int x);
}
interface Demo{
    void out();
}

 public class interf implements Sample, Demo {
    public void show(int x){
        System.out.println(x);
    }
    public void out(){
        System.out.println("out.");
    }
    public static void main(String args[]){
        interf ob = new interf();
        ob.show(12);
        ob.out();
    }
}