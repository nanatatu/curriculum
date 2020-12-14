package exercise;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class TimeMain {

	public static void main(String[] args) {
		//①Timeクラスは直接値を変更することはできない
		//②Calendarクラスと異なり、月が１の場合はそのまま１として表示される。
		
		LocalDateTime ldtNow = LocalDateTime.now();
		System.out.println(ldtNow.toString());
		//時刻標準時を取得
		
		OffsetDateTime odtNow = OffsetDateTime.now();
		System.out.println(odtNow.toString());
		//標準時と自国標準時の時差を取得
		
		ZonedDateTime zdtNow = ZonedDateTime.now();
		System.out.println(zdtNow.toString());
		//OffsetDateTimeにタイムゾーンを加え取得
	}

}
