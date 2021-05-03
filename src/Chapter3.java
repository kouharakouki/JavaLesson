
public class Chapter3 {

	public static void main(String[] args) {

//		天気による変化を表す
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else {
			System.out.println("DVDを見ます");
		}

//		冗長でスッキリしないコード
		System.out.println("あなたの運勢を占います");
		int forturn = new java.util.Random().nextInt(4) + 1;
		if (forturn == 1) {
			System.out.println("大吉");
		} else if (forturn == 2) {
			System.out.println("中吉");
		} else if (forturn == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}

//		switch文の記述
		switch (forturn) {
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
		}
	}

}
