import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	
	public static String convert(String s, int numRows)
	{
		if(numRows == 1) return s;
		
		int currentRow = 0;
		boolean currentDirection = false;
		List<StringBuilder> rows = new ArrayList();
		StringBuilder result = new StringBuilder();
		
		
		for(int i = 0 ; i < Math.min(numRows, s.length()) ; i++)
		{
			rows.add(new StringBuilder());
		}
		
		for(char c : s.toCharArray()) 
		{
			rows.get(currentRow).append(c);  //append the character into the correct stringBuilder
			if(currentRow == 0 || currentRow == numRows - 1)
			{
				currentDirection = !currentDirection;
			}
			
			currentRow += currentDirection ? 1:-1;
		}
		
		for(StringBuilder build : rows)
		{
			result.append(build);
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convert("PAYPALISHIRING", 3));
	}

}
