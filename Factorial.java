
public class Factorial {
	public static void main(String[] args)
	{	final int NUMBERS = 10;
		for(int i = 0; i < NUMBERS; i++)
			System.out.println( i + "! is " + factorial(i));
	}
	
	public static int factorial(int n)
	{	int result = 1;
		for(int i = 2; i <= n; i++)
			result *= i;
		return result;
	}
}
