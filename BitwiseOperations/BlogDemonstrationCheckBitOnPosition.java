public class CheckBitOnPosition
{
	public static void main(String[] args)
	{
		int bitNumber = 3;
		int numberForCheck = 4;
		int result = (numberForCheck >> (bitNumber -1)) & 1; 
		System.out.println(result);
	}
}
