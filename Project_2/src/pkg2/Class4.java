package pkg2;

public class Class4 {
	

	public void four_par(int a, int b, int c, int d)
	{
		this.one_par(1);
		System.out.println("Hi.. I four parameterized from pkg2 class4");
	}
	
	public void one_par(int a)
	{
		//this.defaultfun();
		System.out.println("Hi.. I am one parameterized from pkg2 class4");
	}
	public void two_par(int a, int b)
	{
		this.four_par(1, 2, 3, 4);
		System.out.println("Hi.. I am two parameterized pkg2 class4");
	}


}
