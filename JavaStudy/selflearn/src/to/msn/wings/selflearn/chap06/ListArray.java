package to.msn.wings.selflearn.chap06;

import java.util.ArrayList;
import java.util.Arrays;

public class ListArray {
//サイズ可変の配列

	public static void main(String[] args) {
		var list = new ArrayList<Integer>(Arrays.asList(10, 15, 30, 60));
		var list2 = new ArrayList<Integer>(Arrays.asList(1, 5, 3, 6));
		var list3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

		for (var i : list) {
			System.out.println(i / 5);
		}

		System.out.println(list.size());			//要素数
		System.out.println(list.get(0));			//引数の値を抽出
		System.out.println(list.contains(30));		//要素に引数が含まれて
		System.out.println(list.indexOf(30));		//配列の順番を抽出
		System.out.println(list.lastIndexOf(30));	//配列の逆順番を抽出
		System.out.println(list.isEmpty());			//配列が空かどうかを判定
		System.out.println(list.remove(0));			//要素を削除
		System.out.println(list);

		list.addAll(list2);							//listを結合
		System.out.println(list);

		list.removeAll(list3);						//listの重複を削除
		System.out.println(list);

		list.set(0,100);							//要素の追加（(x, y)x番目にyを追加
		var data = list.toArray();
		System.out.println(Arrays.toString(data));


	}

}
