import java.util.Scanner;

public class Staircase
{
   static int a[]={0,1,2,3};     //array of integers storing the input i.e. 1 3 7 suppose
    static int b[];     //array storing output
    static int count;   //count is for input values
    static int number;   //value of b[i] at each index
    static Scanner sc=new Scanner(System.in);
    static int c[];
    
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
        for(int i=1;i<a.length;i++)
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

