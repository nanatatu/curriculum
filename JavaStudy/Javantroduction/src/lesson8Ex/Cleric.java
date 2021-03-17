package lesson8Ex;

public class Cleric {
	String name = "Hikakin";
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;


public void selfAid() {
	mp -= 5;
	hp = MAX_HP;
	System.out.println(this.name + "はセルフエイドを使った！");
	System.out.println("HP:" + this.hp + "MP:" + this.mp);
	}
}
