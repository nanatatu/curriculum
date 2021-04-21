package to.msn.wings.selflearn.chap06;

import java.util.Arrays;
import java.util.TreeSet;

public class SetTree {

	public static void main(String[] args) {
		//TreeSet ソート済みセット　並び順を管理するセットクラス

		var ts = new TreeSet<Integer>(Arrays.asList(1, 20, 30, 10, 60, 15));
		System.out.println(ts);
		System.out.println(ts.descendingSet());		//要素を逆順に並べかえ
		System.out.println(ts.ceiling(15));			//指定する要素以上で最小の要素を取得
		System.out.println(ts.lower(15));			//指定する要素以下で最大の要素を取得
		System.out.println(ts.tailSet(15));			//指定の要素以上の要素を取得
		System.out.println(ts.headSet(30, true));	//指定の要素より小さい要素を取得 trueの場合は等しいものも含む
	}

}
