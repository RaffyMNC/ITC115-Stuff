package randomwalk;

public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomwalk();
	}
	public static void randomwalk() {
		int currentPosition = 0;
		int currentMax = 0;
		int currentMin = 0;
		
		while(currentPosition != 3 && currentPosition != -3) {
			double random = Math.random();
			if(random < 0.5) {
				currentPosition++;
				if(currentPosition > currentMax) {
					currentMax=currentPosition;
				}
			}else {
				currentPosition--;
				if(currentPosition < currentMax) {
					currentMax=currentPosition;
				}
				
			}
			System.out.println("Position=  " + currentPosition);
		}
		
		if (currentPosition == 3) {
			System.out.println("Min position= " +currentMin);
		}else {
			System.out.println("Max position= " +currentMax);
		}
		
	}
}
