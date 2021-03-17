package lesson10;

public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("じょうくうへ　とびあがった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("かえってきたぞ！");
	}
	//オーバーライドHeroのrun()とSuperHeroのrun()
	public void run() {
		System.out.println(this.name + "はにげだした！");
	}
	public void attack(SimonJap sj) {
		super.attack(sj);	//親インスタンス部分のattack()を呼び出し

		if (this.flying) {
			super.attack(sj);
		}
	}

}
