package WalkupTest;

public abstract class Ticket {
	int ticketNumber;
	public Ticket(int ticketNumber) {
		this.ticketNumber=ticketNumber;
	}
	public abstract double getPrice(); 
	public abstract String toString();
	

}
