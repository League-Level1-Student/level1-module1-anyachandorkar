

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	RaceCar mqueen = new RaceCar("maserati",5);
		// 3. Get the RaceCar to print its position in the race.
mqueen.getPositionInRace();
		// 4. Crash the RaceCar
		mqueen.crash();
		// 5. If the car is damaged. Bring it in for a pit stop.
mqueen.isDamaged();
mqueen.pit();
		// 6. Help the car move into first place.
for (int i = 0; i < 7; i++) {
	
mqueen.overtake();
mqueen.getPositionInRace();
	}}
}
