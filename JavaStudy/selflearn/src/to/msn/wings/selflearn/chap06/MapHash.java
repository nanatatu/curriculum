package to.msn.wings.selflearn.chap06;

import java.util.HashMap;
import java.util.Map;

public class MapHash {

	public static void main(String[] args) {
		var map = new HashMap<String, String>(Map.of("Rose", "バラ", "SunFlower", "ひまわり", "Morning Glory", "あさがお"));
		System.out.println(map.containsKey("Rose"));		//指定のキーが含まれているか
		System.out.println(map.containsValue("バラ"));		//指定の値が含まれているか
		System.out.println(map.isEmpty());					//マップの中身が空か

		for (var key : map.keySet()) {						//全てのキーを取得
			System.out.println(key);
		}

		for (var value : map.values()) {					//全ての値を取得
			System.out.println(value);
		}

		map.replace("Rose", "薔薇");						//指定のキーの値をvalueに置き換え
		map.replace("Sunflower", "ひまわり", "向日葵");

		for (var entry : map.entrySet()) {					//全ての要素を取得
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
