//write a java program to construct the interface and declare the method double area(double x, double y) inside the interface construct three class with name rectangel triangle square to implement this program with the help of interface.
interface Area{
    double area(double x, double y);
}
class rectangle implements Area{
    public double area(double x,double y){
        return x*y;
    }
}
class triangle extends rectangle{}
public class newex extends rectangle {
    public static void main(String args[]){
    newex ob = new newex();
    System.out.println(ob.area(2,3));
    }
}
