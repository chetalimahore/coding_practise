
public class TotalDecode {
	
	static int count=0;
	public static int decode(char ch[], int length) {
		if(length==0 || length==1) {
			return 1;
		}
		else {
			if(ch[length-1]>'0') {
				count+= decode(ch, length-1);
			}
			if(ch[length-2]=='1' || ch[length-2]=='2' && ch[length-1]<'7') {
				count+=decode(ch, length-2);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr="11";
		char ch[]=arr.toCharArray();
		System.out.println(decode(ch, ch.length));
	}

}




