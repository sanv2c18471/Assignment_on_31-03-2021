package demo5;

import java.util.function.Function;

public class Example2 
{
public 	static int square (int a) {
	return a*a;
}
	public 	static int add (int a, int b) {
		return a+b;
}	
public static void main(String[] args) {
System.out.println("the square of the number is: "+square(2));	
System.out.println("Addition of two numbers is: "+add(2,4));
Function <Integer,Integer> f= i->i*i;
System.out.println("the square of number:"+f.apply(5));
}
}
