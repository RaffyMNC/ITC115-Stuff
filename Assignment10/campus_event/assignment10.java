package campus_event;

import java.util.Scanner;

public class assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("\nEnter Choice"+"of Ticket type\n"+"1/ Walkup-ticket\n"+"2. Advance-Ticket\n"+"3. StudentAdvanceTicket\n");
		System.out.println("Choice: ");
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		if(choice==1)
		{
			int num=(int)(Math.random()*99);
			Ticket wt=new WalkupTicket(num);
			System.out.println(wt);
		}
		if(choice==2)
		{
			int num=(int)(Math.random()*99);
			Ticket sat= new StudentAdvanceTicket(num,11);
			System.out.println(sat);
		}
		if(choice==3) {
			int num=(int)(Math.random()*99);
			Ticket at= new AdvanceTicket(num,11);
					System.out.println(at);
		}
		s.close();
	}

}
