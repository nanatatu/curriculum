package to.msn.wings.selflearn.chap03;

import java.math.BigDecimal;

public class Basic {

	public static void main(String[] args) {
		var result1 = "";
		for (var i = 0; i < 100; i++) {
			result1 += "いろは";
		}

		//繰り返し構文の中で文字列連結を行う場合は、StringBuilderクラスを用いた方が処理が早い
		var builder = new StringBuilder();
		for (var i = 0; i < 100; i++) {
			builder.append("いろは");
		}

		var result2 = builder.toString();

		System.out.println(result2);

		System.out.println(Math.floor((0.7 + 0.1) * 10));	//正確な値が計算できない。

		var bd1 = new BigDecimal("0.7");
		var bd2 = new BigDecimal("0.1");
		var bd3 = new BigDecimal("10");
		System.out.println(bd1.add(bd2).multiply(bd3));		//正確な値を計算できる。
		//BigDecimalクラスをインスタンス化するときは、文字列リテラルとして指定する。

	}

}
