import java.io.*;
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []list1={16.1,12.3,22.2,14.4};
		double []list2= {1.5,4.3,7.0,19.5,25.1,46.2};
		
		if(isSorted(list1))
			System.out.println("List1 is sorted");
		else
			System.out.println("List1 is not sorted");
		
		if(isSorted(list2))
			System.out.println("List2 is sorted");
		else
			System.out.println("List2 is not sorted");
			
	}

	public static boolean isSorted (double [] arr) {
		for(int i=0;i<arr.length -1 ;i++) {
			if(arr[i+1]<arr[i]) {
				return false;
			}
		}
		return true;
	}
}
