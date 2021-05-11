import java.util.Random;
import java.util.Scanner;

public class TyouHan {
	private static int money = 10000;
	private static int bet;
	private static int dice;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("丁半賭博");

		while(true) {
		System.out.println("貴方の所持金は現在" + money + "円です。");
		bet();
		diceNum();
		game();

		System.out.println("もう一度ゲームを行いますか？(y/n) >");
		String repeatGame = scan.next();

			if(repeatGame.equals("y")) {}
			else if (repeatGame.equals("n")) {
				System.out.println("貴方の最終所持金は" + money + "円です。");
				break;
			} else {
				System.out.println("入力値が不正です。(y/n)で入力してください。 >");
			}

		}


	}

	//ダイスメソッド
	private static int diceNum() {
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;

		return dice;

	}

	//賭け金メソッド
	public static int bet() {

		while (true) {
			System.out.println("賭け金を入力してください。");
			bet = scan.nextInt();
			System.out.println(bet + "円賭けます。よろしいでしょうか？(y/n) >");

			String flug = scan.next();
			if (flug.equals("y")) {
				money -= bet;
				return money;
			} else if (flug.equals("n")) {

			} else {
				System.out.println("入力値が不正です。(y/n)で入力してください。>");
			}
		}

	}

	public static int game() {

		while(true) {
			System.out.println("半 = 1 : 丁 : 2 >");
			int gameFlug = scan.nextInt();

					if (gameFlug == 1) {
						while(true) {
						if (dice % 2 == 1) {
							System.out.println("出目は" + dice + "です。");
							System.out.println("貴方の勝ちです。");
							System.out.println("賞金" + bet * 2 + "円を手に入れた。");
							return money += bet * 2;
						} else if (dice % 2 == 0) {
							System.out.println("出目は" + dice + "です。");
							System.out.println("貴方の負けです。");
							return money;
						} else {
							System.out.println("入力値が不正です。(1/2)で入力してください。 >");
						}
						}

					} else if (gameFlug == 2) {
						while(true) {
						if (dice % 2 == 0) {
							System.out.println("出目は" + dice + "です。");
							System.out.println("貴方の勝ちです。");
							System.out.println("賞金" + bet * 2 + "円を手に入れた。");
							return money += bet * 2;
						} else if (dice % 2 == 1) {
							System.out.println("出目は" + dice + "です。");
							System.out.println("貴方の負けです。");
							return money;
						} else {
							System.out.println("入力値が不正です。(1/2)で入力してください。 >");
						}
						}

			} else {
				System.out.println("入力値が不正です。(1/2)で入力してください。 >");
			}
		}


	}
}
