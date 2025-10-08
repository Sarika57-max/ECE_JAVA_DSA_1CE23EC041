package Day5;

public class Smallest_elements_in_array {
	public static void main(String[] args) {
		int[] arr = {10,24,25,3,7};
		int smallest = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr [i] < smallest) {
				smallest = arr[i];
				
			}
		}
		System.out.println("smallest element in the array :" + smallest);
	}

}
