package SortAlgorithms;

import java.util.Arrays;

public class SelectionSort
{
	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(selectionSort(new int[] { 5, 3, 1, 2, 4 })));
	}

	public static int[] selectionSort(int[] array)
	{
		int first;
		int temp;
		for (int i = array.length - 1; i > 0; i--)
		{
			first = 0;
			for (int j = 1; j < i; j++)
			{
				if (array[j] > array[first])
					first = j;
			}
			temp = array[first];
			array[first] = array[i];
			array[i] = temp;
		}
		return array;
	}
}
