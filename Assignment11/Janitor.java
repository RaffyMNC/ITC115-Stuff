
public class Janitor extends Employee {
	public int getHours() {
		return 80;
	}
	public double getSalary() {
		return 30000.0;
	}
	public int getVacationDays() {
		return 5;
	}
	public void clean() {
		System.out.println("Working for the man");
	}
	public String getVacationForm() {
		String color = "yellow";
		return color;
	}

}
