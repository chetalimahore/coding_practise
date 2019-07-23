package com.strings;

public class StringCompression {
	
	static String compress(String str)
	{
		StringBuilder build = new StringBuilder();
		
		int i = 0, j = 0, count = 0;
		
		while(i < str.length())
		{
			
			while(j < str.length())
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
					j++;
				}
				else
				{
					break;
				}
			}
			
			if(count == 1) {
				build.append(str.charAt(i));
			}
			else {
				build.append(str.charAt(i)).append(count);
			}
			
			i = j;
			count = 0;
			
		}
		
		if(build.toString().length() == str.length())
		{
			return str;
		}
		
		return build.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("a"));
	}

}
