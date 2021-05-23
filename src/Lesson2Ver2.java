
public class Lesson2Ver2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("aとbの大きい方の数字は" + m);

		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年" + (n + 1) + "歳になります");

		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分" + r + "歳ですね");

		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("ようこそ" + name + "さん");
	}

}
