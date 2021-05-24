
public class Chapter3Ver2 {

	public static void main(String[] args) {
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
		} else {
			System.out.println("DVDを見ます");
		}

		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4);
		++fortune;
		switch (fortune) {
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
				break;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
			System.out.println("現在" + (i + 1) + "週目");
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
