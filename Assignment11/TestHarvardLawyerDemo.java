
public class TestHarvardLawyerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee edna=new Employee();
		System.out.print("Edna: ");
		System.out.print(edna.getHours()+"Hrs, ");
		System.out.print("$"+edna.getSalary()+", ");
		System.out.print(edna.getVacationDays()+"days, ");
		System.out.println(edna.getVacationForm()+", ");
		
		Lawyer john=new Lawyer();
		System.out.print("Lawyer: ");
		System.out.print(john.getHours()+"Hrs, ");
		System.out.print("$"+john.getSalary()+", ");
		System.out.print(john.getVacationDays()+"days, ");
		System.out.println(john.getVacationForm()+", ");
		
		HarvardLawyer mark=new HarvardLawyer();
		System.out.print("HarvardLawyer: ");
		System.out.print(mark.getHours()+"Hrs, ");
		System.out.print("$"+mark.getSalary()+", ");
		System.out.print(mark.getVacationDays()+"days, ");
		System.out.println(mark.getVacationForm()+", ");
	}

}
