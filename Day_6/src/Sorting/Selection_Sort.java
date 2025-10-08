package Sorting;

public class Selection_Sort {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		System.out.println("Unsorted array:" );
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		int[] array = SelectionSort(arr);
		System.out.print("Sorted array:");
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(array[i] + " ");
		}
	}
	  public static int [] SelectionSort(int[] arr) {
		  for (int i = 0; i < arr.length-1; i++)
		  {
			  int minPos = i;
			  for(int j = i + 1; j<arr.length; j++)
			  {
				  minPos = j;
			  }
			  int temp = arr[minPos];
			  arr[minPos] = arr[i];
			  arr[i] = temp;
		  	 }
	  
	  return arr;
}
}
