/**
 * @author chetali
 * */
public class Revbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 3;
		long k = 0;
		int noOfBytes = Long.SIZE/8;
		
		for(int i = 0; i < noOfBytes * 8; ++i) {
			long temp = (n & (1 << i));
			if(temp != 0) {
				k = k | (1 << (63 - i));
			}
		}
		System.out.println(k);
	}

}

