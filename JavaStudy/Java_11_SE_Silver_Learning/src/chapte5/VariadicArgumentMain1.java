package chapte5;

public class VariadicArgumentMain1 {

	public void method(String s, int... a) {
		System.out.println(s + "サイズ:" + a.length);
		for(int i : a) {
			System.out.println("第2引数の値 :" + i);
		}
	}

	public static void main(String[] args) {
		VariadicArgumentMain1 obj = new VariadicArgumentMain1();
		int[] ary = {10, 20, 30};

		obj.method("1回目");			//サイズ:0
		obj.method("2回目", 10);
		obj.method("3回目", 10, 20);
		obj.method("4回目", ary);		//配列自体を渡すことも可能
		//	obj.method("5回目", null);	//実行時エラー

	}

}
