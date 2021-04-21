package to.msn.wings.selflearn.chap5;

public class DefaultLibrary {

	public static void main(String[] args) {
		var str1 = "WINGSプロジェクト";
		System.out.println(str1.length());

		//compareTo 辞書的な大小を比較
		var str = "def";
		System.out.println(str.compareTo("abc"));
		System.out.println(str.compareTo("def"));
		System.out.println(str.compareTo("xyz"));
		System.out.println(str.compareToIgnoreCase("DEF"));

		//文字列が空であるかを判定
		var str2 = "";
		var str3 = "　";
		System.out.println(str2.isEmpty());
		System.out.println(str3.isEmpty());		//全角はfalse判定
		System.out.println(str3.isBlank());		//全角はtrue判定

		var str4 = "  Wings Project  ";
		System.out.println(str4.strip());
		System.out.println(str4.stripLeading());



	}

}
