package pkg1;
import pkg2.*;
public class Class3 {
	/*3 parameterized method
	default method
	1 parameterized method
	4 parameterized method
	2 parameterized method
*/
	public void defaultfunc()
	{
		this.three_par(1, 2, 3);
		System.out.println("Hi.. I am default method");
	}
	
	public void three_par(int a, int b, int c)
	{
	//obj1.one_par(1);
		System.out.println("Hi.. I am three parameterized method");
	}	
	
	public static void main(String[] args) {
		Class5 c5 = new Class5();
		c5.five_par(1, 2, 3, 4, 5);
		Class3 obj = new Class3();
		obj.defaultfunc();
		// using different class from same package
		
		//Class2 obj1 = new Class2();
		//obj1.two_par(2, 4);
		
		//using different package using import
		Class4 c4 = new Class4();
		c4.two_par(1, 2);
		
		// using different package with two different class using import
		
		
		
		
		
	
}}