package scrapingSample;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SimpleScraping {

	public static void main(String[] args) {

		//try-catch文が必要
        try {

            //Document A = Jsoup.connect("url").get(); urlにスクレイピング対象
            Document doc = Jsoup.connect("https://www.yahoo.co.jp/").get();

            //Elements B = A.select("タグ"); この形でソースに含まれるタグで指定された範囲を書き出す。
            Elements elm = doc.select("title");

            //拡張for文
            for(Element elms : elm) {
                String title = elms.text();
                System.out.println(title);
            }

            //例外処理
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}