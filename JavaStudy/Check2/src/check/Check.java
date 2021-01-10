package check;

import constants.Constants;

//Check
public class Check {
	
	private static String firstName = "浅井";
	private static String lastName = "友貴";
	
	private static void printName() {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}
	
	public static void main(String[] args) {
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		printName();
		pet.introduce();
		rp.introduce();
		
	}
}
