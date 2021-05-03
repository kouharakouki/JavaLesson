
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

//		あえてbreak文を書かないパターン
		switch (forturn) {
			case 1:
				System.out.println("いいね");
				break;
			case 2:
			case 3:
				System.out.println("普通です");
				break;
			case 4:
				System.out.println("うーん");
		}

//		基本的なfor文
		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
		}

//		ループ変数はブロック内で使用可能
		for (int j = 0; j < 10; j++) {
			System.out.println("現在" + (j + 1) + "周目");
		}

//		for文のループを２重にして九九の表を出力
		for (int k = 1; k < 10; k++) {
			for(int m = 1; m < 10; m++) {
				System.out.print(k * m);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
