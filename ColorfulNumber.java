import java.util.*;

public class ColorfulNumber {

	ArrayList<Integer> arrlist=new ArrayList<Integer>();
	public void colorful(int number){
	
		int x=0; 
		while(number!=0) {
			x=number%10;
			arrlist.add(x);
			number=number/10;
		}
		Collections.sort(arrlist);
		int n=findLength(arrlist.size())-arrlist.size();
		Integer array[]=arrlist.toArray(new Integer[arrlist.size()]);
		int k=0; int group=1; int i=0; int count=0; boolean flag=true;
		while(k!=n && flag==true) {
			int result=1;
			while(i+group<=n && count<=(i+group)) {
				result=array[i]*result;
				
				 
				 if(count==group) {
					 flag=search(result, arrlist, 0, arrlist.size());
						if(flag==true){
							flag=false;
							break;
						}
						else {
							arrlist.add(result);
							flag=true;
							result=1;
						}
					i=0;count=0;
					   
				 }
				 group++;count++;i++; 
			
			}
			group++;
			
				
			}
		}
	
	public int findLength(int num) {
		if(num==1)
			return 1;
		else return num+findLength(num-1);
	}
	
	public boolean search(int num, ArrayList<Integer> list, int start, int end) {
		if(start>end || start==-1) {
			return false; 
		}
		
		if(num==arrlist.get(start))
			return true;
		
		int mid=(start+end)/2;
		if(num<=arrlist.get(mid)) {
			return search(num, list, start, mid);
		}
		else {
			return search(num, list, mid+1, end-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorfulNumber color=new ColorfulNumber();
		color.colorful(324);
		
	}

}



