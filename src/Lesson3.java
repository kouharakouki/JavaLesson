
public class Lesson3 {

	public static void main(String[] args) {

//		練習問題3-3
		int isHungry = 1;
		String food = "焼肉";

		System.out.println("こんにちは");

		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}


//		練習問題3-5
		System.out.print("[メニュー]　１：検索　２：登録　３：削除　４：変更　＞");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
			default:
		}


//		練習問題3-6
		System.out.println("数当てゲーム");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("あたり！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}

}
