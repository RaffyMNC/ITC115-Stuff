import java.util.Scanner;

public class assignment4repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, output;
		int times;
		
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		str=input.nextLine();
		System.out.print("Enter a number of repetitions: ");
		times=input.nextInt();
		
		output=repl(str,times);
		
		System.out.println("The call repl(\""+str+"\","+times+") should return \""+output+"\".");
		
		
				
	}

	private static String repl(String str, int times) {
		// TODO Auto-generated method stub
		String newStr="";
		if(times<=0)
			return newStr;
		else
		{
			for(int i=1;i<=times;i++)
				newStr=newStr+str;
			return newStr;
		}
	}

}
