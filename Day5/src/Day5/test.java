package Day5;

public class test {
        test(int a, int b)
        {
       System.out.println("a =" + a + "b=" +b);
       }
        test (int a, float b)
        {
        	System.out.println("a =" +a + "b =" +b);
       }
        public static void main(String[] args) {
			byte a =1;
			byte b = 5;
			test test = new test(a,b);
		}
   
}
