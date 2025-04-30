package Arrays;


class Arrays_multidlength {
    public static void main(String[] args) {

        // create a 2d array
        int[][] a = {
            {1, -2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
            	/*if(a[i][j]<0)
            	{
            		System.out.println(a[i][j]);
            	}*/
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
