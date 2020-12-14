package exercise;
import java.util.Calendar;

public class CalenMain {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		
		cal.add(Calendar.MONTH, 7); 
		// 普通に加算すると、１３以上になる。addメソッドを用いる
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		
	}

}
