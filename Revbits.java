/**
 * @author cheta
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
// -1073741824
// 3

/*

unsigned int Solution::reverse(unsigned int A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    unsigned int k = 0;
	for(int i = 0; i < sizeof(unsigned int) * 8; ++i){
	    if(A & (1 << i)) {
		    k |= (1 << (((sizeof(unsigned int) * 8)-1) - i));
	    }
    }
	return k;
}


 */