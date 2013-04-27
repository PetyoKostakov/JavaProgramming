package SortAlgorithms;

import java.util.Arrays;

public class InsertSort
{
	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(insertSort(new int[]{5,3,1,2,4})));
	}

	public static int[] insertSort(int[] array)
	{
		for (int i = 1; i < array.length; i++)
		{
			int value = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > value)
			{
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = value;
		}
		return array;
	}
}
