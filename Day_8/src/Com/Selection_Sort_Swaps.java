package Com;

public class Selection_Sort_Swaps {
	public static void main(String[] args) {
		int [] a = {29,10,14,37,13};
		int swaps = 0;
		for(int i = 0; i< a.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j< a.length; j++)
				if(a[j]<a[min])min = j;
			if(min != i) {
				int t = a[i]; a[i] = a[min] ; a[min] = t;
				swaps ++;
			}
		}
		System.out.println("Swaps :" + swaps);
	}

}
