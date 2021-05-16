import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Chapter15a {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);

		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");


//		TimeAPIを使用
		Instant i1 = Instant.now();
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();

		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間をさしています");
		}

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate Idate = LocalDate.parse("2020/09/22", fmt);

		LocalDate Idatep = Idate.plusDays(1000);
		String str = Idatep.format(fmt);
		System.out.println("1000日後は" + str);

		LocalDate now1 = LocalDate.now();
		if (now1.isAfter(Idatep)) {
			System.out.println("1000日後は過去日付です");
		}


//		periodクラスの利用例
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);

//		3日間を表す２通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);

		LocalDate d3 = d2.plus(p2);
		LocalDate d4 = d2.plus(p1);

		System.out.println(d3);
		System.out.println(d4);
	}

}
