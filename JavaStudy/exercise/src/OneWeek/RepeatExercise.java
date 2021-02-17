package OneWeek;

import java.util.Random;

public class RepeatExercise {

	public static void main(String[] args) {
		Random rand = new Random();
		int num;
		for (int i = 0; i < 5; i++) {
			num = rand.nextInt(100) + 1;
			System.out.println(num);

		}
	}

}
