
public class StringClass {

	public static void main(String[] args) {
		String str = "Javaの学習";
		String data = "2021/02/17";

		//int length()	文字数をカウント
		System.out.println(str.length());

		//int indexOf(String str)	指定された文字が何文字目にあるかをカウント
		System.out.println(str.indexOf("学習"));
		System.out.println(str.indexOf("Ruby"));	//含まれない場合は-1が返される

		//boolean contains(CharSequence s)		//指定された文字列を含む場合にtrueを返す
		System.out.println(str.contains("Java"));
		System.out.println(str.contains("Ruby"));

		//String replace(CharSequence target,Charsequence replacement)	//targetをreplacementの文字列で置き換え、複数ある場合は全て置き換え。
//		置き換え後の文字列は新しいStringオブジェクトとなり、元の文字列は変更されない
		System.out.println(str.replace("Java", "Java言語"));

//		String[] split(String regex)		//正規表現に一致する位置で文字列を分割し、結果を配列で返す。
		String[] items = data.split("/");	//を区切りとして分割する
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}

	}

}
