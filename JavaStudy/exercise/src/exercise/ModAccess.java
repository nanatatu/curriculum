package exercise;

public class ModAccess {
	public String pub_ver = "Public";
	protected String prot_var = "Protected";
	String pack_var = "Package Private";
	private String pri_var = "Private";

	/* public		...すべてのクラスからアクセスできる
	 * protected	...現在のクラスとサブクラスからアクセスできる
	 * なし			...現在のクラスと同じパッケージのクラスからアクセスできる
	 * private		...現在のクラスからだけアクセスできる
	 */
	
	public void test() {
		System.out.println(this.pub_ver);
		System.out.println(this.prot_var);
		System.out.println(this.pack_var);
		System.out.println(this.pri_var);
	}
	
	public static void main(String[] args) {
		ModAccess m = new ModAccess();
		m.test();
	}

}
