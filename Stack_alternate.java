
public class Stack_alternate
{
	static int a[]=new int[10];
	static int top=-1;
	static int size=a.length;
	static int new_size=0;
   public static void push(int number)
   {
	   if(top!=size-1)
	   {
		   a[++top]=number;
	   }
   }
   
   public static int pop()
   {
	   if(top!=-1)
	   {return a[top--];}
	   else return -1;
   }
   
   public static void print_alternate(int count)
   {
	   int counter=0;
	   int number=-1;
	   for(int i=new_size;i>0;i--)
	   {
		   counter++;
		   number=pop();
		   if(counter==count)
		   {
			   System.out.println(number);
			   counter=0;
		   }
	   }
	   
	   
   }
   
   public static void print_stack()
   {
	   for(int i=new_size-1;i>=0;i--)
	   {
		   System.out.println(a[i]);
	   }
   }
   public static void main(String[] args)
   {
	 int i;
	 for(i=0;i<9;i++)
	 {
		 push(i+1);
	 }
	 new_size=i;
	 print_stack();
	 print_alternate(2);
	 //print_stack();
	 //System.out.println("The elements popped:");
	 //System.out.println(pop());
   }
   
}
