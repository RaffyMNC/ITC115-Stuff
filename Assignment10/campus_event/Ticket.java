package campus_event;
import java.util.Scanner;

public abstract class Ticket {
	
	
private int number;

protected double price;

public Ticket(int number) {
	this.number=number;
}
public double getPrice() {
	return price;
}
public String toString()
{
	return "Number"+number+",price:"+price;
			}
	}

