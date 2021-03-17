package lesson8;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();	//Heroクラスからインスタンスを生成し、変数hに入れる

		//フィールドに初期値をセット
		h.name = "シバター";
		h.hp = 100;

		Syamu_game syamuA = new Syamu_game();	//一人目のSyamu_gameを召喚

		syamuA.hp = 50;
		syamuA.suffix = 'A';

		Syamu_game syamuB = new Syamu_game();	//二人目のSyamu_gameを召喚

		syamuA.hp = 48;
		syamuB.suffix = 'B';

		h.slip();
		syamuA.run();
		syamuB.run();
		h.run();

	}

}
