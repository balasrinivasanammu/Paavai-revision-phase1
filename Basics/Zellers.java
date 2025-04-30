package Basics;

public class Zellers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=07,m=02,f=0,r,c,year=2024,d;
		m=m-2;
		   if(m==-1)
		   {
			   m=11;
			   year=year-1;
		   }
		   else if(m==0)
		   {
			   m=12;
			   year=year-1;
		   }
		        c=year/100;//2023/100
		        d=year%100;//2023%100
		        
		    //F = K + [(13xM – 1)/5] + D + [D/4] + [C/4] – 2*c
        
		        f=(k+((13*m-1)/5))+d+(d/4)+(c/4)-(2*c);
		        
		        r=f%7;
		        if(r<0)
		        	
		        {
		        r=7+r;
		        }
		        switch(r)
		        {
		        case 0:
		        System.out.println("\nsunday");
		        break;
		        case 1:
		        System.out.println("\nmonday");
		        break;
		        case 2:
		        System.out.println("\ntuesday");
		        break;
		        case 3:
		        System.out.println("\nwednesday");
		        break;
		        case 4:
		        System.out.println("\nthursday");
		        break;
		        case 5:
		        System.out.println("\nfriday");
		        break;
		        case 6:
		        System.out.println("\nsaturday");
		        break;
		    }

		/*int a=10;
		float b=(float)a;
		float c=12.5f;
		int d=(int)c;
		System.out.println(b);
		System.out.println(d);*/
	}

}


