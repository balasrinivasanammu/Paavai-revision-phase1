package Arrays;

import java.util.Scanner;

public class Arrays_smallest {  
    public static void main(String[] args) {  
  
        //Initialize array  
        //int [] age = new int [] {250, -11, 60, 400, -5};
        //or
        //int[] age = {250, 35, 45};
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the array size:");
    	int size=s.nextInt();
    	int age[]=new int[size];
    	for(int i=0;i<size;i++)
    	{
    		age[i]=s.nextInt();
    	}
    	
        
        
        //Initialize min with first element of array.  
        int min = age[0];  
        //Loop through the array  
        for (int i = 0; i < age.length; i++) {  
            //Compare elements of array with min  
           if(age[i] >min) 
           {
               min = age[i];//35  
           }
        }  
        System.out.println(min);  
    }  
}
//tspkarthi265@gmail.com
