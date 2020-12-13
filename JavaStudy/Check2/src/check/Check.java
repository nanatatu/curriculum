package check;

import constants.Constants;

public class Check {
	
	private String firstName = "浅井";
	private String lastName = "友貴";
	
	private void printName() {
		System.out.println("printNameメソッド → " + this.firstName + this.lastName);
	}
	
	public static void main(String[] args) {
		
		Check check = new Check();
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		check.printName();
		pet.introduce();
		rp.introduce();
		
	}
}
