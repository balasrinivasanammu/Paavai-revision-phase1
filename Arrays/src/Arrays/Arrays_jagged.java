package Arrays;
class Arrays_jagged{  
    public static void main(String[] args){  
        //declaring a 2D array with odd columns  
        int arr[][] = {
        		{2,6,4,3,100,50,4},
        		{4,8},
        		{5,6,7 ,9,7}
        };        
        for (int i=0; i<arr.length; i++) 
        { 	
        	int m=arr[i][0];
            for(int j=0; j<arr[i].length; j++)
            {
            	if(arr[i][j]<m)
            	{
            		m=arr[i][j];
            	}
            }         
            //System.out.println();
            System.out.println(m);       
        } 
    	/*int arr[][] = {
        		{2,3,4},
        		{4,8},
        		{20,15}
        };  
    	
        for (int i=0; i<arr.length; i++) 
        { 
        	int sum=0;
        	for(int j=0;j<arr[i].length;j++)
        	{
        		sum=sum+arr[i][j];
        }
        System.out.println(sum);
        }*/
        /*int apple[][]=new int[10][5];
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	int arr[][] = {
        		{200,3,4},
        		{4,80},
        		{20,15,47,31}
        };  
        for (int i=0; i<arr.length; i++) // rows
        { 
        	for(int j=0;j<arr[i].length;j++) // cols
        	{
        		if(arr[i][j]%2==0)
        		{
        			System.out.print(arr[i][j]+" ");
        		}
        		
        }
        System.out.println();
        }*/

    }
}



