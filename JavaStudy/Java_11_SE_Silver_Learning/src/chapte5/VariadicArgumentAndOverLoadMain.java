package chapte5;

public class VariadicArgumentAndOverLoadMain {

	//完全一致
	public void method(int a) {
		System.out.println("method(int a)");
	}

	//暗黙の型変換
	public void method(long a) {
		System.out.println("method(long val)");
	}

	//Boxing(基本データ型からそのラッパークラスへの変換)
	public void method(int... a) {
		System.out.println("method(int... a");
	}

	//可変長引数
	//public void method(int[] a) {
	//	System.out.println("method(int[] a)");
	//}
	public static void main(String[] args) {

		VariadicArgumentAndOverLoadMain obj = new VariadicArgumentAndOverLoadMain();
		obj.method(100);	//完全一致するmethod(int a)が優先される

		//完全一致 > 暗黙の型変換 > Boxing > 可変長引数

	}

}
