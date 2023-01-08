package calories;

import java.util.Scanner;
public class DP
{ 
    static int min(int a, int b)
    {
         return a < b ? a : b;

    }
    
    static int calories1(int day,int c[],int p[],int va[])
    {
        int G1[]= new int [day];
        int G2[] =new int[day] ;
        int G3[]=new int [day];
        G1[0] =  c[0];
        G2[0] =  p[0];
        G3[0] =  va[0];
        
        for (int Q = 1; Q < day; Q++)
        {
             G1[Q] = min(G3[Q-1] ,G2[Q - 1] )+   c[Q];
             G2[Q] = min(G1[Q-1] ,G3[Q - 1] )+   p[Q];
             G3[Q] = min(G1[Q-1] ,G2[Q - 1] )+   va[Q];   
        }
        int d=min(G1[day-1],G2[day-1]);
        return min(d,G3[day-1]);
         
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);   
        int day =sc.nextInt();
        
        
        int c[] = new int[day] ;
        int p[] = new int[day] ;
        int va[] = new int[day] ;
        for(int Q=0; Q<day; Q++)  
        {  
          c[Q]=sc.nextInt(); 
        }
  
        for(int Q=0; Q<day; Q++)  
        {  
          p[Q]=sc.nextInt(); 
        }
        
        for(int Q=0; Q<day; Q++)  
        {  
          va[Q]=sc.nextInt(); 
        }
        System.out.println(calories1(day,c,p,va));
    
    }
    }