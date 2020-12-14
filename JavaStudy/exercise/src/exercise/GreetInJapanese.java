package exercise;

//extends Greet で Greet コントローラを継承
public class GreetInJapanese extends Greet {
	
	//morningメソッドをオーバーライド（上書き）
	public void morning() {
		System.out.println("おはようございます");
	}
}
