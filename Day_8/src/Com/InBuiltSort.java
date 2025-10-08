package Com;

import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {
	public static void main(String[] args) {
		Integer arr[] = {5,2,1,3,2};
		Arrays.sort(arr,0,3, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
