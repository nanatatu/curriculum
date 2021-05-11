package chap06;

interface A { }
class B { }
class C extends B { }
class D { }

public class InstanceofOperator {

	public static void main(String[] args) {
		//instanceof演算子…特定のオブジェクトが指定の型を持つか判定し、結果をbooleanで返す。
		C obj = new C();
		System.out.println(obj instanceof A);	//CクラスはAインターフェイスを実装していない。
		System.out.println(obj instanceof B);	//CクラスはBクラスをスーパークラスにもつ
		System.out.println(obj instanceof C);
//		System.out.println(obj instanceof D);	　CクラスはDクラスと継承関係がない。
	}

}
