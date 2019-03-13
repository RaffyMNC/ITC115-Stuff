package campus_event;

public class AdvanceTicket extends Ticket{
	public AdvanceTicket(int number,int daysInAdvance) {
		super(number);
		if(daysInAdvance < 10)
		{
			price=40;
		}
		else {
			price=30;
		}
	}

}
