
public class KirbyMain {

	public static void main(String[] args) {
	//まずはプラズマを吸い込む！
		AblityOfEnemy aoe = new PlasmaWisp("プラズマ波動団！！");
		//うつべし！
		aoe.useAbility();
		//つづいてナイトを吸い込む
		aoe = new BradeKnight("百烈切り！");
		//切るべし！
		aoe.useAbility();

	}

}
