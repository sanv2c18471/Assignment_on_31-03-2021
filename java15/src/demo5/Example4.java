package demo5;
interface Add1{
	public int add(int a, int b);
}
public class Example4 {
public static void main(String[] args) {
	Add1 ab = (a,b)->(a+b);
	System.out.println(ab.add(2, 5));

	Add1 ab1 = (int a, int b)->{
		return(a+b);
	};
	System.out.println(ab1.add(10, 5));	
}
}