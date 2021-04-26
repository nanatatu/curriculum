
public class Deck {
	//カードクラスを格納する配列
	private Card card[];

	//コンストラクタ（山札の作成)
	public Deck() {
		//52枚のカードを格納する配列を宣言する
		card = new Card[52];
		//山札の枚数をカウントする変数
		int rand = 0;

		//カードのマークの種類分ループを回す
		for (int i = 1; i <= 4; i++) {
		//ループの1回目
				if (i == 1) {
					//ハートの1~13を作成
					for ( int j = 1; j <= 13; j++) {
						this.card[rand] = new Card("ハート", j);
						rand++;
					}
				}else if (i == 2) {
					for ( int j = 1; j <= 13; j++) {
						this.card[rand] = new Card("ダイヤ", j);
						rand++;
					}
				}else if (i == 3) {
					for ( int j = 1; j <= 13; j++) {
						this.card[rand] = new Card("スペード", j);
						rand++;
					}
				}else if (i == 4) {
					for ( int j = 1; j <= 13; j++) {
						this.card[rand] = new Card("クローバー", j);
						rand++;
					}
				}
			}
		}
		//作成したカードの一覧を表示するメソッド
	public void DisplayCardlist() {
		for (Card s : this.card) {
			System.out.println(s.getSuit() + s.getNum());
		}
	}

}
