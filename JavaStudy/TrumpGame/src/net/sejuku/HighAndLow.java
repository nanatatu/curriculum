package net.sejuku;

import java.util.Random;
import java.util.Scanner;

public class HighAndLow {
	static Scanner scan = new Scanner(System.in);

	static int money = 10000;
	static int times = 1;
	static int count = 1;
	static boolean gameFlug = false;
	static int winCount = 0;
	static int drawCount = 0;
	static int loseCount = 0;

	public static void main(String[] args) {
		System.out.println("High And Low");

			System.out.println("あなたの所持金は" + money + "円です。");
			System.out.print("賭け金を入力してください。 >");
			int bet = scan.nextInt();
			while (money - bet < 0) {

				System.out.println("所持金を超える賭け金です。");
				System.out.print("賭け金を入力してください。 >");
				bet = scan.nextInt();
			}
				money -= bet;
				System.out.println(bet + "円を賭けました。");

			game(bet);
			times++;

			System.out.println(times + "回目の挑戦です。");
			System.out.println("次の倍率は" + Math.ceil(betPercentage() * 100 )/ 100 + "倍です。");

			if (gameFlug) {

				System.out.print("NextUpチャレンジしますか？(y/n) >");
				String flug = scan.next();

				if(flug.equals("y")) {nextUpGame(bet);}

				else if(flug.equals("n")) {

				} else {
					//後で
				}
			} else {
				System.out.print("もう一度挑戦しますか？(y/n) >");
				String flug = scan.next();

				if(flug.equals("y")) {game(bet);}

				else if(flug.equals("n")) {

				} else {
					//後で
				}


			}


		System.out.println("最終金額" + money + "円です。");
		System.out.println("勝:" + winCount + "負:" + loseCount + "引分:" + drawCount);
		System.out.println("ゲームを終了します。");
	}

	public static void game (int bet) {
		Random rand = new Random();
		int card1 = rand.nextInt(13) + 1;
		int card2 = rand.nextInt(13) + 1;

		System.out.println(money);
		System.out.println("倍率は" + Math.ceil(betPercentage() * 100 )/ 100);
		System.out.println("カードの数字は" + card1 + "です。");

		System.out.println("High or Low? (h/l) >");
		String choice = scan.next();
		System.out.println("２枚目のカードは" + card2 + "です。");
		while(true) {
			if(choice.equals("h")) {
				if(card1 < card2) {
					System.out.println("あなたの勝ちです。");

					double winMoney = (double)bet * betPercentage();
					money += (int)winMoney;

					count++;
					winCount++;
					gameFlug = true;

					System.out.println((int)Math.floor(winMoney) + "円を獲得した。");
					break;
				} else if(card1 == card2) {
					System.out.println("引き分けです");
					money += bet;
					drawCount++;
					gameFlug = false;


					break;
				} else {
					System.out.println("あなたの負けです。");
					count = 1;
					loseCount++;
					gameFlug = false;


					break;
				}

		}else if (choice.equals("l")) {
				if(card1 > card2) {
					System.out.println("あなたの勝ちです。");
					double winMoney = (double)bet * betPercentage();
					money += (int)winMoney;

					count++;
					winCount++;
					gameFlug = true;


					System.out.println((int)Math.floor(winMoney) + "円を獲得した。");
					break;
				} else if(card1 == card2) {
					System.out.println("引き分けです");
					money += bet;
					drawCount++;
					gameFlug = false;

					break;
				} else {
					System.out.println("あなたの負けです。");
					count = 1;
					loseCount++;
					gameFlug = false;

					break;
				}

			} else {

			}
		}
	}

	public static void nextUpGame(int bet) {
		Random rand = new Random();
		int card1 = rand.nextInt(13) + 1;
		int card2 = rand.nextInt(13) + 1;

		System.out.println("所持金は" + money + "円です。");
		System.out.println("賭け金は" + bet + "円です。");
		System.out.println(times + "回目の挑戦です。");
		System.out.println("倍率は" + Math.ceil(betPercentage() * 100 )/ 100);
		System.out.println("カードの数字は" + card1 + "です。");

		System.out.println("High or Low? (h/l) >");
		String choice = scan.next();
		System.out.println("２枚目のカードは" + card2 + "です。");
		while(true) {
			if(choice.equals("h")) {
				if(card1 < card2) {
					System.out.println("あなたの勝ちです。");

					double winMoney = (double)bet * betPercentage();
					money += (int)winMoney;

					count++;
					winCount++;
					gameFlug = true;

					System.out.println((int)Math.floor(winMoney) + "円を獲得した。");

					break;
				} else if(card1 == card2) {
					System.out.println("引き分けです");
					money += bet;
					drawCount++;
					gameFlug = false;

					break;
				} else {
					System.out.println("あなたの負けです。");
					count = 1;
					loseCount++;
					gameFlug = false;

					break;
				}

		}else if (choice.equals("l")) {
				if(card1 > card2) {
					System.out.println("あなたの勝ちです。");
					double winMoney = (double)bet * betPercentage();
					money += (int)winMoney;

					count++;
					winCount++;
					gameFlug = true;


					System.out.println((int)Math.floor(winMoney) + "円を獲得した。");
					break;
				} else if(card1 == card2) {
					System.out.println("引き分けです");
					money += bet;
					drawCount++;
					gameFlug = false;

					break;
				} else {
					System.out.println("あなたの負けです。");
					count = 1;
					loseCount++;
					gameFlug = false;

					break;
				}

			} else {

			}
		}


	}

	public static double betPercentage() {
		double perst = (double) Math.pow(1 + (0.2 * count) ,2);
		return perst;
	}


}
