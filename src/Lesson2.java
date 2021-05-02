
public class Lesson2 {

	public static void main(String[] args) {

//		練習問題2-1
		int x = 5;
		int y = 10;
		String ans = "X+Yは" + (x + y);
		System.out.println(ans);

//		練習問題2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(3);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("１：大吉　２：中吉　３：吉　４：凶");
	}

}
