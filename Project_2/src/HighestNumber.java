import java.util.Scanner;

public class HighestNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to know the Highest Digit: ");
		int i= scan.nextInt();
		int j=0;
		
		int length = String.valueOf(i).length();
		
		for(int a = 1; a<=length; a++)
		{
			int remainder = i%10;
			i = i/10;
			
			if(j<remainder)
				j=remainder;
		}
		System.out.println(j);
	}

}
