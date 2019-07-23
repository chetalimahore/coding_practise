import java.util.ArrayList;

public class RemoveDuplicatesSorted {

	public static int removeDuplicates(ArrayList<Integer> a) {
	    if(a==null) return 0;
	    else{
	        int index=1;
	        for(int i=1;i<a.size();i++){
	            if(a.get(i).intValue()!=a.get(i-1).intValue()){
	                int temp=a.get(index);
	                a.set(index, a.get(i));
	                index++;
	            }
	        }
	        return index;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(1); array.add(1);
		array.add(2); array.add(2);
		array.add(3); array.add(3); array.add(3);
		removeDuplicates(array);
	}

}
