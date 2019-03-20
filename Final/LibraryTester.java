
public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library mobydick=new Library();
			System.out.print(mobydick.checkIn()+"13 ,");
			System.out.print(mobydick.ItemNO()+"23421, ");
			System.out.print(mobydick.TypeOfItem()+"BK,");
			System.out.print(mobydick.Title()+"Mobydick ,");
			System.out.println(mobydick.Reserve()+"N/A");
			System.out.println();
		
		Library pulpfiction=new Library();
			System.out.print(pulpfiction.checkIn()+"21 ,");
			System.out.print(pulpfiction.ItemNO()+"63671, ");
			System.out.print(pulpfiction.TypeOfItem()+"MV,");
			System.out.print(pulpfiction.Title()+"Pulpfiction ,");
			System.out.println(pulpfiction.Reserve()+"Raffy");
			System.out.println();
		
		Library wildlifeexploration=new Library();{
			System.out.print(wildlifeexploration.checkIn()+"42 ,");
			System.out.print(wildlifeexploration.ItemNO()+"24256, ");
			System.out.print(wildlifeexploration.TypeOfItem()+"CD,");
			System.out.print(wildlifeexploration.Title()+"WildlifeExploration ,");
			System.out.print(wildlifeexploration.Reserve()+"Harry ");
			System.out.println("Fines="+wildlifeexploration.payFines());
			System.out.println();
		Library scary=new Library();
			System.out.print(scary.checkIn()+"24 ,");
			System.out.print(scary.ItemNO()+"42132, ");
			System.out.print(scary.TypeOfItem()+"BK,");
			System.out.print(scary.Title()+"Scary Stories to tell in the dark ,");
			System.out.println(scary.Reserve()+"N/A");
			System.out.println();
		}
	}

}
