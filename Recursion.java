public class Recursion {
  
	public static int sum(int num) {
		if (num > 0) {
			return num + sum(num - 1);
		}
		return 0;
	}

	public static void main(String[] args) {
		
      int num = 13;  
      int counter = num;
      int sum = 0;
      int i = 0;
      while (i < num) { 
         i++; 
         sum = sum + counter; 
         counter--; 
      }
      System.out.println(sum); 
      System.out.println(sum(13));
	}
}