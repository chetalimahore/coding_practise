
public class MultiplyStrings {

	public static String addStrings(String a, String b) {
		if(a==null) return b;
		else if(b==null) { return a;}
		else {
			String result="";
			String reverse="",arev="", brev="";
			int length=0, x=0, carry=0 ;
			
			if(a.length() >= b.length()) {
				length = a.length(); 
			}
			else {
				length = b.length();
			}
			int i=0;
			while(i < length) {
				if(i >= a.length()) {
					x = 0 + Character.getNumericValue(b.charAt(i)) + carry;
				}
				else if(i >= b.length()) {
					x = Character.getNumericValue(a.charAt(i)) + 0 + carry;
				}
				else if(i != a.length() && i != b.length()){ 
					x = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carry;
				}
				if(x / 10 > 0) {
					carry = x/10;
					result = result + x % 10;
				}
				else {
					carry = 0;
					result = result + x;
				}
				i++;
			}
			if(carry != 0) {
				result = result + carry;	
			}
			
			return result;
		}
		
	}
	
	public static String multiplyStrings(String a, String b) {
		int val=0;
		if( a =="0" || b =="0") {
			return String.valueOf(val);
		}
		else {
			String s1; 
			String s2;
			String num1="", num2="", str="", arev="", brev="";
			int result=0, carry=0, length=0;
			int i=0,j=0, k=0;
			
			for(int x=a.length()-1; x>= 0; x--) {
				arev = arev + a.charAt(x);
			}
			for(int y=b.length()-1 ; y>=0 ; y--) {
				brev = brev + b.charAt(y);
			}
			
			if(arev.length() >= brev.length()) {
				length = arev.length();
				s1 = brev;
				s2 = arev;
			}
			else {
				length = brev.length();
				s1 = arev; 
				s2 = brev;
			}
			
			
			while( j!= s2.length()) {
				while(k!=j) {
					num1 = num1+"0";
					k++;
				}
				if(i <= s1.length()-1) {
					result = Character.getNumericValue(s1.charAt(i)) * Character.getNumericValue(s2.charAt(j)) + carry;
					if(result / 10 > 0) {
						carry = result / 10;
						num1 = num1 + result % 10;
					}
					else {
						carry = 0;
						num1 = num1 + result;
				} 
				i++;
				}
				else {
					if(carry != 0) {
						num1 = num1 + carry;
					}
					i=0; j++; carry=0; k=0;
					num2 = addStrings(num2, num1);
					num1 = "";
				}
			}
			
			return str = new StringBuffer(num2).reverse().toString();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(addStrings("3333311111111111","44422222221111"));
		System.out.println(multiplyStrings("1235421415454545454545454544", "1714546546546545454544548544544545"));
	}
}


