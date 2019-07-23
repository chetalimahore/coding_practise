import java.util.Scanner;

public class Staircase
{
   static int a[]={0,1,2,3};     //array of integers storing the number of steps that can be taken
    static int b[];     //array used for memoisation
    static int count;   //count is for input values
    static int number;   //value of b[i] at each index
    static Scanner sc=new Scanner(System.in);
    static int c[];  // array for storing th3e output for display
    
    public static boolean check(int number)
    {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==number)
                return true;
        }
        return false;
    } 
    
    public static int result(int n)
    {
        int sum=0;
        for(int i=1;i<a.length;i++)          //total number of steps will come by subtracting the given number from 
        {
           if(n-a[i]>0)
           {
               sum=sum+b[n-a[i]];
           }
        }
        return sum;
    }
    
    public static int arrange(int number)
    {
        for(int i=1;i<=number;i++)
        {
           if(check(i)==true)
           {
               b[i]=1+result(i);
           }
           else b[i]=result(i);
        }
        
        return b[number];
    }
    public static void main(String args[])
    {  
        int n=sc.nextInt();
        c=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int x=sc.nextInt();
            b=new int[x+1];
            c[i]=arrange(x);
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println("c[i]="+c[i]);
        }
        
    }
    
}

