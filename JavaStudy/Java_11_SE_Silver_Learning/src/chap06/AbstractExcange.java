package chap06;

abstract class Super {
	int x;
	int y;
	public abstract void print();
	public void method(int x, int y) {
		this.x = x;
		this.x = y;
	}
}

 class MyClass extends Super {
	public void print() {
		System.out.println("x:" + x + "y:" + y);
	}

}

public class AbstractExcange {
	public static void main(String[] args) {
	//スーパークラスの変数にサブクラスのオブジェクトを代入　OK
	Super obj = new MyClass();
	obj.method(10, 20);
	//サブクラスのメソッド呼び出し　OK
	obj.print();
	}

}
