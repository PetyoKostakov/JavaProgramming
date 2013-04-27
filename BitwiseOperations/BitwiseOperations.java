public abstract class BitwiseOperations
{
	// Odd or Even check methods 
	static int oddOrEven(int checkNumber)
	{
		return checkNumber & 1;
	}
	
	static boolean isEven(int checkNumber)
	{
		return (checkNumber & 1) == 0;
	}
	
	static void oddOrEvenToString(int checkNumber)
	{
		System.out.println("The number " + checkNumber + " is " + (checkNumber == 1 ? "odd!" : "even!"));
	}
	
	//These methods check the value of the bit on determined position in determined number
	static int checkBitValueOnPosition(int numberForCheck , int bitPosition)
	{
		int result = (numberForCheck >> (bitPosition)) & 1; 
		return result;
	}
	
	static boolean checkBitValueOnPositionBool(int numberForCheck, int bitPosition)
	{
		int result = (numberForCheck >> (bitPosition)) & 1; 
		return result == 0 ? false : true;
	}
	
	//This method exchange bit on determined position with other bit on determined position 
	//Keep in mind that bits start with position od 0
	static int bitExchange(int number, int positionOfBit1 , int positionOfBit2)
	{
		int bit1Value = (number >> (positionOfBit1)) & 1; 
		int bit2Value = (number >> (positionOfBit2)) & 1; 
		int exchangedNumber = number;
		
		//numbers in these positions are equal
		if (bit1Value == bit2Value)
		{
			return exchangedNumber;
		}
		
		//numbers in these positions are different
		//change the value of first position
		if(bit1Value == 0 && bit2Value == 1)
		{
			exchangedNumber = exchangedNumber | (1 << positionOfBit1);
		}
		else if(bit1Value == 1 && bit2Value == 0)
		{
			exchangedNumber = exchangedNumber & ~(1 << positionOfBit1);
		}
		
		//change the value of second position
		if(bit2Value == 0 && bit1Value == 1)
		{
			exchangedNumber = exchangedNumber | (1 << positionOfBit2);
		}
		else if(bit2Value == 1 && bit1Value == 0)
		{
			exchangedNumber = exchangedNumber & ~(1 << positionOfBit2);
		}
		return exchangedNumber;
	}
}
