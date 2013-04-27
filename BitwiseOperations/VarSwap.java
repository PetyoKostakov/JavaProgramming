package BitwiseOperations;

public class VarSwap
{
  	public static void main(String[] args)
	{
		int a = 5;
		int b = 8;
		
		System.out.println("Value of \"a\" before operations: " + a);
		System.out.println("Value of \"b\" before operations: " + b);
		
		a ^= b;
		b ^= a;
		a ^= b;
		
		System.out.println("Value of \"a\" after operations: " + a);
		System.out.println("Value of \"b\" after operations: " + b);
	}
}