package Day5;

public class Missingnumbers_inarray {
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,8,9,};
		int n = 9;
		System.out.println("Missing numbers are :");
		for (int i = 1; i <= n; i++) {
			boolean found = false;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] ==i) {
					found = true;
					break;
					
				}
			}
			if(!found) { 
				System.out.println(i + " ");
			}
		}
	
	}
}
