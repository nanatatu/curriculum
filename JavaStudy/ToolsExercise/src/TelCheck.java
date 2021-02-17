import java.util.regex.Pattern;

public class TelCheck {

	public static void main(String[] args) {

	}
	public int CheckNo() {
		String pattern = "^\\d{2,4}-\\d{2,4}-\\d{4}$";
		String telNum = "090-7022-2695";
		Pattern p = Pattern.compile(pattern);

		if(p.matcher(telNum).find()) {
			return 0;
		} else {
			return 1;
		}

	}

}
