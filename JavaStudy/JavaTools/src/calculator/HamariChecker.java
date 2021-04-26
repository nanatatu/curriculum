package calculator;

import java.util.Scanner;

public class HamariChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("はまりチェッカー");
		System.out.print("初当たり確率:>");
		double a = scan.nextDouble();

		System.out.print("現在回転数");
		double b = scan.nextDouble();

		double result = (Math.floor(calculation(a,b) * 10000000) / 10000000);

		System.out.println("ハマり確率は" + result + "%です。");
		System.out.println("これは大当たり" + Math.round(100 / result) + "回に1回起こる確率です。");
	}

	public static double calculation(double a, double b) {
		return (double)Math.pow(((a - 1) / a), b) * 100;

	}

}
