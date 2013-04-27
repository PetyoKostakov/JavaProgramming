package SortAlgorithms;

import java.util.Arrays;

public class BubbleSortWith2Loops
{
	public static void main(String[] args)
	{	
		System.out.println(Arrays.toString(bubbleSort(new int[]{5,3,1,2,4})));
	}
	static int[] bubbleSort(int[] array)
	{
		int var;
		for (int i = 0; i < array.length; i++)
		{
			for (int k = 0; k < array.length -1; k++)
			{
				if(array[k] > array[k+1])
				{
					var = array[k];
					array[k] = array[k+1];
					array[k+1] = var;
				}
			}
		}
		return array;
	}
}
