
public class MathClass {

	public static void main(String[] args) {
		System.out.println("-5の絶対値は" + Math.abs(-5)); 		//abs(int i)			iの絶対値を返す。
		System.out.println("3.0の平方根は" + Math.sqrt(3.0));	//sqrt(double d)		dの平方根を返す
		System.out.println("半径2の面積は" + 2 * 2 * Math.PI);	//定数PI				円周率の定数
		System.out.println("sin60°は" + Math.sin(60.0 * Math.PI / 180.0));	//因数の値の単位がラジアン

	}

}
