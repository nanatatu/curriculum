package CodeZine;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
//		標準入力された値があればそのまま表示、
//		値がなければエラーメッセージを表示するプログラムを作成してください。
//		なお、「EXIT」が入力されるまで、処理を繰り返し続けるものとします。

		//入力読み込み
		Scanner scan = new Scanner(System.in);
		String input = "";

		while(true) {
			System.out.print(">");
			input = scan.next();

			if(input.length() == 0) {
				System.out.println("エラー：入力がありません");
			} else if (input.equals("EXIT")) {
				System.out.println("ループを終了します。");
				break;
			} else {
				System.out.println(input);
				continue;
			}
		}
	}
}
