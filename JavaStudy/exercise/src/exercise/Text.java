package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Text {

	public static void main(String[] args) throws ParseException {
		
		String dateTime = "2018/01/01 00:00:00";
		//日時をStringで受け取る
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = sdf.parse(dateTime);
		
		System.out.println(date);
		// TODO 自動生成されたメソッド・スタブ

	}

}
 