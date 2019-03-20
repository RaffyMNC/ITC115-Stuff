
public abstract class Movie extends Library {
	public String checkIn(){
		return "CHKin#";
	}
	public String checkOut(){
		return "CHKout#";
	}
	public double payFines(){
		return 125;
	}
	public String Reserve(){
		return"ReservedBy: ";
	}
	public String TypeOfItem(){
		return"Item: ";
	}
	public String Title(){
		return "Title: ";
	}
	public String ItemNO(){
		return "ITM#";
	}

}


