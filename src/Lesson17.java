
public class Lesson17 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();
			System.out.println("ーースタックトレース（ここまで）ーー");
		}

		try {
			int i = Integer.parseInt("三");
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatExceptionの例外が発生しました");
		}
	}

}
