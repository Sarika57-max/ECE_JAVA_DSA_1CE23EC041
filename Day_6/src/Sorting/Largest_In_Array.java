package Sorting;

public class Largest_In_Array {
	public static int getlargest (int[] arr) 
	
	{
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i ++)
		{
			if (largest < arr[i])
			{
				largest = arr[i]; 
			}
		}
		return largest;
		
		}
	public static void main(String[] args) {
		int[] arr = {1,4,7,9,3,8};
		int largest = getlargest(arr);
		System.out.println(" The largset element is :" + largest);
		
		
		
	}

}
