package CodeZine;

import java.time.LocalDate;
import java.util.Scanner;

public class Q2 {
//	標準入力された月、日が、
//	今日であるかどうかを判定するプログラムを作成してください。

	public static void main(String[] args) {
		LocalDate todaysDate = LocalDate.now();
		Scanner scan = new Scanner(System.in);
		String month = todaysDate.toString().substring(5,7);
		String date = todaysDate.toString().substring(8,10);

		System.out.println("今日は何月何日でしょう？");
		System.out.print("何月？==>");
		String inputMonth = scan.next();

		System.out.print("何日？==>");
		String inputDate = scan.next();

		if (inputMonth.equals(month) & inputDate.equals(date)) {
			System.out.println("正解！！");
		} else {
			System.out.println("間違っています。");
		}

	}

}
