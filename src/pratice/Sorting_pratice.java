package pratice;

public class Sorting_pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]input = {3,6,1,9,2,8,1};
		
		sort(input);
	}
	
	public static void sort(int[]input) {
		int index = 0;
		for(int i = 0;i<input.length-1;i++) {
			int lowest = input[i];
			for(int j = i;j<input.length;j++) {
				 if(input[j]<lowest) {
					 int temp = input[i];
					 input[i]=input[j];
					 lowest = input[j];
					 input[j]=temp;
				 }
			}
		}
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
	}
}