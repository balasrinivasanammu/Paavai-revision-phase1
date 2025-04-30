package Arrays;

public class Array_ultidimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[][]={
				{10,20,30,100},
				{20,40,50},
				{70,80}
				};  
		//printing 2D array  
		for(int i=0;i<arr.length;i++){  
		 for(int j=0;j<arr[i].length;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}

	}

}

//arr[2][2]