package scraping;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SimpleScraping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("URLを入力 >");
		String url = scan.next();
		scan.close();

		try {
			Document doc = Jsoup.connect(url).get();

			//ソースに含まれるタグで指定された範囲を抽出
			Elements elm = doc.select("title");

			for(Element elms : elm) {
				String title = elms.text();
				System.out.println(title);
			}

		} catch(IOException e) {
			e.printStackTrace();

		}

    }

}

