public class reference {
		 int x =10;
	public static void main(String args[]) {
		reference ob;
		reference obj = new reference();
		ob = obj;
		System.out.println(ob.x);
		System.out.println(obj.x);
	}
}
