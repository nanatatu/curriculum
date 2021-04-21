package to.msn.wings.selflearn.chap5;

import java.util.ArrayList;

public class RegularExpression {

	public static void main(String[] args) {
		var data = new ArrayList<String>() {
			{
				add("バラ");
				add("ひまわり");
				add("あさがお");
			}
		};

		for(var s : data) {
			System.out.println(s);
		}
	}

}
