
import acm.program.*; 
import java.util.Scanner;

public class Fibonacci extends ConsoleProgram {
	
	public static void main(String[] args) 
	{
		
		int i = 0;
		int preVal = 1;
		int newVal = 1;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your series number");
		int n = sc.nextInt();
		System.out.print("1 1 ");
		
		//loops and prints the sequence after the first two numbers
		while(i <= n)
		{
			i = newVal + preVal;
			System.out.print(i + " ");
			newVal = preVal;
			preVal = i;
			
		}
		
	}
}
