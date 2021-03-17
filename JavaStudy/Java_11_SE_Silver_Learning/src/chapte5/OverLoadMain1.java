package chapte5;

public class OverLoadMain1 {
	void myPrint() {
		System.out.println("myPrint()");
	}

	void myPrint(String s) {
		System.out.println("myPrint(String s)");
	}

	void myPrint(int a) {
		System.out.println("myPrint(int a)");
	}

	void myPrint(int a,int b) {
		System.out.println("myPrint(int a, int b)");
	}

	public static void main(String[] args) {
		OverLoadMain1 t = new OverLoadMain1();	//Testクラスのインスタンス化

		t.myPrint();
		t.myPrint(100);
		t.myPrint(100, 200);
		t.myPrint("yamamoto");

	}

}
