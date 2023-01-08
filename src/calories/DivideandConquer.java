package calories;

import java.util.Scanner;

public class DivideandConquer {

	private static int min(int a, int b) {
		 return a < b ? a : b;
	}	
	static int f( int cal[][],int w,int t) {
	if(w==0) {	
		  return cal[t][0];
	}
	    	if(t==0) return min(f(cal,w-1,1 ),f(cal,w-1,2))+cal[0][w];
	    	if(t==1) return min(f(cal,w-1,0 ),f(cal,w-1,2))+cal[1][w];
	    	if(t==2) return min(f(cal,w-1,0 ),f(cal,w-1,1))+cal[2][w];
			return 0;
		}
	  public static void main (String[] args)
	    {
	        Scanner sc=new Scanner(System.in);   
	        int day =sc.nextInt();
	        int c[][] = new int[3][day] ;
	        for(int q=0; q<3; q++) {
	        	 for(int e=0; e<day; e++){
	          c[q][e]=sc.nextInt(); 
			}
	        	 }
	        int d=min(f(c,day-1,0),f(c,day-1,1));
	        int cal=min(d,f(c,day-1,2));
	        System.out.println(cal);
	    
	    }
	
}
