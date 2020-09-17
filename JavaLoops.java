class JavaLoops { 
   
   public static void main (String[] args) { 
   
   int[] intArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; 
   int size = intArray.length;
   
   for (int i = 0; i < size; i++) { 
      if (intArray[i] % 2 == 0) { 
         System.out.println(intArray[i]); 
         } 
      } 
      // I created a loop that interated through the length of the array 
      // and then printed out the elements of the array that when divided 
      // by 2 leave no remainder (i.e numbers that are even)
   } 
}
 