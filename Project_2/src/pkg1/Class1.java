package pkg1;

public class Class1 {
	
	/*3 parameterized method
	default method
	1 parameterized method
	4 parameterized method
	2 parameterized method
*/
	
	public void defaultfun()
	{
		this.three_par(1, 2, 3);
		System.out.println("Hi.. I am Default method");
	}
	
	public void one_par(int a)
	{
		this.defaultfun();
		System.out.println("Hi.. I am one parameterized method");
	}
	public void two_par(int a, int b)
	{
		this.four_par(1, 2, 3, 4); //to call 4 parameterized method
		System.out.println("Hi.. I am two parameterized method");
	}
	public void three_par(int a, int b, int c)
	{
		System.out.println("Hi.. I am three parameterized method");
	}
	
	public void four_par(int a, int b, int c, int d)
	{
	this.one_par(1);
		System.out.println("Hi.. I am four parameterized method");
	}
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		
		obj.two_par(2, 4);
		
		
		
	}
	

}
