
public class Prefix_evaluation 
{
	static String input="-*+4325";
	static int arr[]=new int[10];
	static int top=-1;
	
	public static void prefix_evaluate()
	{
		char ch;
		for(int i=input.length()-1;i>=0;i--)
		{
			ch=input.charAt(i);
			if(ch>='0' && ch<='9')
			{
			   push(Character.getNumericValue(ch));
			}
			else if(ch=='-' || ch=='+' || ch=='*' || ch=='/' || ch=='%')
			{
				int a=pop();
				int b=pop();
				int result=perform(a, b, ch);
				if(result!=-1)
					push(result);
			}
		}
		System.out.println(pop());
	}
	
	public static int precedenceLevel(char op) {
	    switch (op) {
	        case '+':
	        case '-':
	            return 0;
	        case '*':
	        case '/':
	            return 1;
	        case '^':
	            return 2;
	        default:
	            throw new IllegalArgumentException("Operator unknown: " + op);
	    }
	}
	
	public static int perform(int a, int b, char ch)
	{
		switch(ch)
		{
		case '+' : return a+b;
		case '-' : return a-b;
		case '/' : return a/b;
		case '*' : return a*b;
		case '%' : return a%b;
		}
		return -1;
	}
	public static void push(int number)
	   {
		   if(top!=arr.length-1)
		   {
			   arr[++top]=number;
		   }
	   }
	   
	   public static int pop()
	   {
		   if(top!=-1)
		   {return arr[top--];}
		   else return -1;
	   }
	   
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		prefix_evaluate();

	}

}
