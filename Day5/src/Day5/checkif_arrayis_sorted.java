package Day5;

public class checkif_arrayis_sorted {
	public static void main(String[] args) {
		int[]arr = {1,2,3,5,7};
		boolean issorted = true;
		for(int i = 0; i< arr.length - 1; i ++ ) {
			if(arr[i]> arr[i+1]) {
				issorted = false;
				break;
			}
		}
		if (issorted) {
			System.out.println("The array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}
	}

}
