package demo5;
interface call{
	public String Name();
}
public class Example3 {
public static void main(String[] args) {
	call c = () -> {
		return "name called out";
	};
	System.out.println(c.Name());
}
}
