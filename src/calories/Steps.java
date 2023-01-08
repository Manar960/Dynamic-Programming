package calories;

import java.util.Scanner;

public class Steps {	
	
    static void calories1(int day,int c[],int p[],int va[])
    {
        int t0[]= new int [day];
        int t1[] =new int[day] ;
        int t2[]=new int [day];
        int c0[]=new int [day];
        int p1[]=new int [day];
        int v2[]=new int [day];
        int x,output,m;
        t0[0] =  c[0];
        t1[0] =  p[0];
        t2[0] =  va[0];
        
        for(int z=1;z<day;z++)
        {
        if((t0[z-1]+va[z]) <=(t1[z-1]+va[z]))
        {
        t2[z]=t0[z-1]+va[z];v2[z]=0;
        }
        else
        {
        t2[z]=t1[z-1]+va[z]; v2[z]=1;
        }
        
        if((t1[z-1]+c[z])<=(t2[z-1]+c[z]))
        {
        t0[z]=t1[z-1]+c[z]; c0[z]=1;
        }
        else
        {
        t0[z]=t2[z-1]+c[z];c0[z]=2;
        }
        
        if((t0[z-1]+p[z])<=(t2[z-1]+p[z]))
        {
        t1[z]=t0[z-1]+p[z]; p1[z]=0;
        }
        else
        {
        t1[z]=t2[z-1]+p[z];p1[z]=2;
        }
        
        }
       
        if(t0[day-1]<t1[day-1]) {
            if(t2[day-1]<t0[day-1]) {
            	output = t2[day-1];x=2;
            } else {
            	output = t0[day-1];x=0;
            }
        } else {
            if(t1[day-1]<t2[day-1]) {
            	output = t1[day-1];x=1;
            } else {
            	output = t2[day-1];x=2;
            }
        }
        
      
 
        System.out.println(output);
        System.out.println("Type 0=Carbohydrates\nType 1=Protein\nType 2=V&A");
        System.out.println("Type "+x+" Day "+day);
        
        m=x;
    	for(int j=day-1;j>=1;j--)
    	{

    	if (m==0)
    	{
    	m=c0[j];
    	System.out.println("Type "+m+" Day "+(j)+" ");
    	}
    	else if(m==1)
    	{
    	m=p1[j];
    	System.out.println("Type "+m+" Day "+(j)+" ");
    	}
    	else if(m==2)
    	{
    	m=v2[j];
    	System.out.println("Type "+m+" Day "+(j)+" ");
    	}
    	}
    	System.out.println();

    	}
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);   
        int day =sc.nextInt();  
        int c[] = new int[day] ;
        int p[] = new int[day] ;
        int va[] = new int[day] ;
        for(int i=0; i<day; i++)  
		{  
          c[i]=sc.nextInt(); 
		}
  
        for(int i=0; i<day; i++)  
		{  
          p[i]=sc.nextInt(); 
		}
        
        for(int i=0; i<day; i++)  
		{  
          va[i]=sc.nextInt(); 
		}
        calories1(day,c,p,va);
    
    }

}
