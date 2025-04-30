package Arrays;

public class Array_duplicatefind {

	  
	    public static void main(String[] args){  
	        //declaring a 2D array with odd columns  
	        int arr[][] = {
	        		{2,6,4},
	        		{4,8,4,4},
	        		{10,37,4,80,4,6,4,9,4,10,4}
	        };
	        //initializing a jagged array  
	        int search = 4;  
	        for (int i=0; i<arr.length; i++) { 
	        	int count=0;
	            for(int j=0; j<arr[i].length; j++)
	            {
	            	if(arr[i][j]==search) { 
	            		++count;
	            	}	            	
	            }
	        System.out.println(count);//new line  
	        }  
	    }
	}


