package scraping;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingOfHorseRacing {

	public static void main(String[] args) {

		//実行時間計測用
		long start = System.currentTimeMillis();

		//csv書き出しの初期化
		BufferedWriter bw = null;

		try {
			//書き出し先ファイルの名前を先頭列を記述
			bw = new BufferedWriter(new FileWriter("/Users/asaitomotaka/LetsEngineer/curriculum/JavaStudy/ScrapingLearning/scraping.csv", true));
			bw.write("馬名,日付,開催,天気,レース名,馬番,人気,着順,騎手,距離,状態,タイム");
			bw.newLine();

			//urlの末文を数字で入れ替える
			for(int j = 2017102170; j <= 2017102180; j++) {

				//別で用意したTestBeansに格納するListを生成
				List<TestBeans> list = new ArrayList<TestBeans>();

				Document doc = Jsoup.connect("http://db.netkeiba.com/horse/"+j).get();

				Elements elm = doc.select("tbody tr");
				Elements title = doc.select("title");

				//馬名を表示させる準備
				//文字数を大まかにとって、そこから空白があったらそこまで切り取る。
				String tstr = title.text().substring(0,10);
				int i = tstr.indexOf(" ");

				if(i == -1) {
					i = 10;
				}
				String tstrs = tstr.substring(0, i);

				//文字列の初期化
				String str = null;
				//ElementsをTestBeansに格納

				for(Element a : elm) {
					str = a.text();
					if(str.indexOf("除") !=-1 || str.indexOf("取") !=-1 || str.indexOf("中") != -1) {
						continue;
					}

					if(str.length() >= 70) {
						String hairetsu[] = str.split(" ");
						TestBeans bean = new TestBeans();
                        bean.setDate(hairetsu[0]);
                        bean.setPlace(hairetsu[1]);
                        bean.setWeather(hairetsu[2]);
                        bean.setRaceName(hairetsu[4]);
                        bean.setHorseNo(Integer.parseInt(hairetsu[7]));
                        bean.setFamous(Integer.parseInt(hairetsu[9]));
                        bean.setScore(Integer.parseInt(hairetsu[10]));
                        bean.setJockey(hairetsu[11]);
                        bean.setCycle(hairetsu[13]);
                        bean.setSituation(hairetsu[14]);
                        bean.setTime(hairetsu[16]);

                        //listに格納
                        list.add(bean);

					}
				}
				for(TestBeans tb : list) {
					bw.write(tstrs);
					bw.write(",");
					bw.write(tb.getDate()+","+tb.getPlace()+","+tb.getWeather()+","+tb.getRaceName()+","+tb.getHorseNo()+","+tb.getFamous()+","+tb.getScore()+","+tb.getJockey()+","+tb.getCycle()+","+tb.getSituation()+","+tb.getTime());
					bw.newLine();
				}
			}
			//close処理
			bw.close();
			System.out.println("完了");


		} catch(IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

		//実行時間計測用
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		System.out.println((end - start) / 1000 + "秒");

	}

}
