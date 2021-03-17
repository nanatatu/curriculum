package chapte5;

public class VariadicArgumentMain2 {
	public void method(String... val) {
		String size = "";
		size += val ==null?"":val.length;
		System.out.println(val + ":" + size);
	}

	public static void main(String[] args) {
		VariadicArgumentMain2 obj = new VariadicArgumentMain2();
		obj.method("A", "B");
		//obj.method(null);				//可変長引数の実態は配列、null値自体を渡したいのか、null値が格納された配列を渡したいのか判断ができない
		obj.method((String[])null);
		obj.method();
		obj.method((String)null);
	}

}
