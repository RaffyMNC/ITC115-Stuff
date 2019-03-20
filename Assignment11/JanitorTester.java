
public class JanitorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee edna=new Employee();
		System.out.print("Edna: ");
		System.out.print(edna.getHours()+"Hrs, ");
		System.out.print("$"+edna.getSalary()+", ");
		System.out.print(edna.getVacationDays()+"days, ");
		System.out.println(edna.getVacationForm()+", ");
		
		Janitor zion=new Janitor();
		System.out.print("Janitor: ");
		System.out.print(zion.getHours()+"Hrs, ");
		System.out.print("$"+zion.getSalary()+", ");
		System.out.print(zion.getVacationDays()+"days, ");
		System.out.println(zion.getVacationForm()+", ");
		zion.clean();
		
	}

}
