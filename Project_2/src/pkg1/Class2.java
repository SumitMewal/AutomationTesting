package pkg1;

public class Class2 {
	
	public void four_par(int a, int b, int c, int d)
	{
		this.one_par(1);
		System.out.println("Hi.. I four parameterized method");
	}
	
	public void one_par(int a)
	{
		//this.defaultfun();
		System.out.println("Hi.. I am one parameterized method");
	}
	public void two_par(int a, int b)
	{
		this.four_par(1, 2, 3, 4);
		System.out.println("Hi.. I am two parameterized method");
	}
//	Class3 c3 =  new Class3();
	/*public static void main(String[] args) {
		Class3 c3 =  new Class3();
	}*/
	
	
	
}
