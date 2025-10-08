package Sorting;

public class Selection_Sort_descending {
	public static void main(String[] args) {
		int [] arr = {5,2,9,1,7};
		int n = arr.length;
		for (int i = 0; i<n-1; i++ ) {
			int maxIndex = i;
			for(int j =i+1; j<n; j++) {
				if(arr[j] > arr[maxIndex]) {
					
					maxIndex = j;

				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = temp;
			}
		System.out.println("Selection sort (descending)");
		for(int num : arr) {
			System.out.println(num + " ");
		}
		
	}
}