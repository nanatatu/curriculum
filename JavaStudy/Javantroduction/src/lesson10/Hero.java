package lesson10;

public class Hero {
	String name ="藤koos";
	int hp = 100;
	//戦う

	public void attack(SimonJap sj) {
		System.out.println(this.name + "の おとのりこうげきだ");
		sj.hp -= 5;
		System.out.println(sj.name + "は　５ぽいんとのだめーじをうけた");
	}

	//逃げる

	public void run() {
		System.out.println(this.name + "は　にげだした。おくびょうものめ");
	}


}
