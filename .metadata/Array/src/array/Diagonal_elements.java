package array;

public class Diagonal_elements{
	public static void main(String[] args) {
	 int[][]matrix = {{1,2,3,4},
	                  {5,6,7,8},
			          {9,10,11,12},
			          {13,14,15,16},
	                  };
	 
	 int sum = 0;
	 
	 for (int i = 0; i < matrix.length; i++)
	 {
		 sum = sum + matrix[i][i];
	 }
	 System.out.println("sum of diagonal elements is :" +sum);
	 }
	}


