import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lesson15a {

	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		LocalDate ldatep = l1.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String str = ldatep.format(fmt);
		System.out.println(str);
	}

}
