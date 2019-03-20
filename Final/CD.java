
public abstract class CD extends Movie{
	public String checkIn(){
		return "CHKin#";
	}
	public String checkOut(){
		return "CHKout#";
	}
	public double payFines(){
		return super.payFines()+super.payFines()*2;
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
