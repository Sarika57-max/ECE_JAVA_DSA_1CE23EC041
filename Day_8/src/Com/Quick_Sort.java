package Com;

public class Quick_Sort {
	public static void quickSort(int arr[], int si, int ei) {
		if(si >= ei)
			return;
		
		int pIdx = partition(arr, si, ei);
		quickSort(arr, si, pIdx - 1);
		quickSort(arr, pIdx + 1, ei);
		
	}
	public static int partition(int arr[], int si, int ei) {
		int pivot = arr[ei];
		int i = si - 1;
		
		for(int j = si; j<ei; j++) {
			if(arr[j] <= pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		i++;
		int temp = arr[i];
		arr[i] = arr[ei];
		arr[ei] = temp;
		return i;
		
	}
	public static void printArr(int arr[]) {
		for(int val : arr)
			System.out.println(val + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {6,3,9,8,2,5};
		System.out.print("Original array:");
		printArr(arr);
		
		quickSort(arr, 0 , arr.length - 1);
		
		System.out.print("Sorted array :");
		printArr(arr);
	}

}
