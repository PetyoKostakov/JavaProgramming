public class OddOrEven
{
	public static void main(String[] args)
	{
		int checkNumber = 4;
		int result = checkNumber & 1;
		System.out.println(result);
		System.out.println("-------------");	
		System.out.println(oddOrEven(10));
	}
	static int oddOrEven(int checkNumber)
	{
		return checkNumber & 1;
	}
}
