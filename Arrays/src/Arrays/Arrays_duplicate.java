package Arrays;

public class Arrays_duplicate {
	public static void main(String arg[])
	{

	 int [] arr = new int [] {10, 20, 300, 40, 20, 70, 80, 80, 30};   
     int count=0;
     System.out.println("Duplicate elements in given array: ");  
     //Searches for duplicate element  
     for(int i = 0; i < arr.length; i++) {  
         for(int j = i + 1; j < arr.length; j++) {  
             if(arr[i] == arr[j]) {
            	 count++;
                 System.out.println(arr[j]);  
             }
         }  
     }  
     System.out.println(count); 
 }  
} 