import java.util.Random;
import java.util.Scanner;


public class HighAndLow {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int num = rand.nextInt(13) + 1;
		int nextNum = rand.nextInt(1) + 1;
		boolean flug = true;

		System.out.println("High And Lowゲーム");

		while (flug = true) {
		System.out.println("トランプの数字は" + num + "です。");
		System.out.println("次のトランプの数字は？（High:h or Low:l)");

		String str = scan.next();
		if("h".equals(str)) {
			System.out.println("引いた数字は" + nextNum + "だ！");

			if (num < nextNum) {
				System.out.println("Your Win!");
			} else if (num > nextNum) {
				System.out.println("Your Lose!");
			} else {
				System.out.println("引き分けです。");
			}

		} else if("l".equals(str)) {
			System.out.println("引いた数字は" + nextNum + "だ！");

			if (num > nextNum) {
				System.out.println("Your Win!");
			} else if (num < nextNum) {
				System.out.println("Your Lose!");
			} else {
				System.out.println("引き分けです。");
			}

		} else {
			System.out.println("入力は" + str + "です。h/rを入力してください。");
		}

		System.out.println("もう一度ゲームをする？y/n");
		str = scan.next();

		if ("y".equals(str)) {

		} else if ("n".equals(str)) {
			flug = false;
			break;
		}
		}

		System.out.println("ゲームを終了します。");

	}

}
