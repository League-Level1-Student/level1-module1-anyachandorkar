
public class Runner {

	public static void main(String[] args) {
		Person Peter = new Person();
		Person Thor = new Person();
		Person Bruce = new Person();
		
		Peter.setName("Peter");
		Thor.setName("Thor");
		Bruce.setName("Bruce");
		Peter.setSuperpower("spiderweb");
		Thor.setSuperpower("undefeatable hammer");
		Bruce.setSuperpower("superstrength");
		
		System.out.println(Peter);
		System.out.println(Thor);
		System.out.println(Bruce);
	}
}
