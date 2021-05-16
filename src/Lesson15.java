import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lesson15 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i + 1).append(",");
		}
		String s = sb.toString();
		String a[] = s.split(",");

		System.out.println(s);
		for (String ab : a) {
			System.out.print(ab);
		}

		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int d = c.get(Calendar.DAY_OF_MONTH);
		d += 100;
		c.set(Calendar.DAY_OF_MONTH, d);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String st = f.format(future);
		System.out.println(st);
	}

	public String concatPath(String folder, String file) {
		if (!folder.endsWith("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}

}
