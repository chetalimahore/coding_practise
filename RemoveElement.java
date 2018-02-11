import java.util.*;

/*
 * @author cheta
 * */


public class RemoveElement {

	public static int removeElement(ArrayList<Integer> a, int b) {
	    Iterator itr=a.iterator();
	    int i=0; int count=0;
	    while(itr.hasNext()){
	        int temp=(int) itr.next();
	        if(temp==b){
	            count++;
	            itr.remove();
	        }
	        i++;
	    }
	    return count;
	}
	
	
	/*public static List<Integer> removeElement(ArrayList<Integer> a, int val) {
		int i=0; int j=a.size()-1; int count=0;
		while(i<=j) {
			if(a.get(i)==val && a.get(j)==val) {
				j--;
			}
			else if(i < j && (a.get(i)==val || a.get(j)==val)) {
				if(a.get(i)==val) {
					a.remove(i);
					count++;
				}
				i++;
			}
			else if(a.get(i)!=val && a.get(j)!=val){
				i++;
			}
		}
		return a.subList(0, i);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(2);
		a.add(2);a.add(4);
		a.add(2);
		/*List<Integer> list=removeElement(a, 2);
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());*/
		
		System.out.println(removeElement(a, 2));
		
	}

}
