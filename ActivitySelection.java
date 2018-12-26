
public class ActivitySelection {

	int start[]=  {1, 3, 0, 5, 8, 5};
	int end[]= {2, 4, 6, 7, 9, 9};
	int task[] = {0, 1, 2, 3, 4, 5};
	
	public void sort() {
		int temp;
		for( int i=0; i< end.length ; i++) {
			for(int j=i+1; j < end.length ; j++) {
				if( end[j] < end[i]) {
					temp = end[i];
					end[i] = end[j];
					end[j] = temp;
					temp = start[i];
					start[i] = start[j];
					start[j] = temp;
					temp = task[i];
					task[i] = task[j];
					task[j] = temp;
				}
			}
		}
	}
	
	public void display() {
		for( int i=0 ; i < start.length ; i++) {
			System.out.println( "----------task--------" + task[i]);
			System.out.println( "start time =" + start[i] );
			System.out.println( "end time=" + end[i] );
		}
	}
	
	public void checkActivity() {
		int result = 0, t = 0;
		result+=end[0]-start[0];
		System.out.println("Task performed \n" + task[0]);
		for( int i = 0, j=i+1 ; i < end.length && j < end.length ; i++, j++) {
			if( start[j] >= end[t] ) {
				System.out.println(task[j]);
				result += (end[i] - start[i]);
				t=j;
			}
		}
		System.out.println("result="+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActivitySelection act = new ActivitySelection();
		act.sort();
		act.display();
		act.checkActivity();
		
	}

}
