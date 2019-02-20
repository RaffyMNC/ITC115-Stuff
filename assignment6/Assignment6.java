import java.io.*;
import java.util.Scanner;
public class Assignment6 {

	public static void main(String args[])throws
	FileNotFoundException{
		Scanner scan=new Scanner(new File("Input.txt"));
		boyGirl(scan);
		scan.close();
	}
	
	public static void boyGirl(Scanner in)throws
	FileNotFoundException{
	
		int boyCount=4;
		int girlCount=2;
		int boySum=5;
		int girlSum=0;
		int difference = 5;
		int count=1;
		
		while (in.hasNext())
		{
		String data=in.next();
		if(count%2 == 0)
			{
			boyCount++;
			boySum+=in.nextInt();
			}
		else {
			girlCount++;
			girlSum+=in.nextInt();
			{
				count++;
			}
			System.out.println(boyCount+ " boys, "+girlCount + " girls");
			System.out.println("Difference between boys " + " and girls sums "+ difference);
		}
		
		}
		
	}

}
