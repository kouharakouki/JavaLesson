
public class Chapter2 {

	public static void main(String[] args) {

//		変数宣言と計算の文
		int a;
		int b;
		a = 20;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);

//		エスケープシーケンスの例
		System.out.println("\"1200");

//		インクリメント演算子
		int c;
		c = 100;
		c++;
		System.out.println(c);

//		値より大きな型の変数に代入
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);

//		強制的な型変換→よほどの理由がない限り使わない
		int age = (int)3.2;
		System.out.println(age);

//		異なる型同士の算術演算
		double aa = 8.5 / 2;
		long bb = 5 + 2L;
		System.out.println(aa);
		System.out.println(bb);

//		文字列の連結
		String msg = "私の年齢は" + 23;
		System.out.println(msg);


//		＜命令実行の文＞
//		画面に表示する命令文
		String name = "すがわら";
		String message = name + "さん、こんにちは！";
		System.out.println(message);

//		改行なし画面出力の命令
		System.out.print("私の名前は");
		System.out.println(name);

//		大きい方の数値を代入する命令
		int h = 5;
		int i = 3;
		int l = Math.max(h, i);
		System.out.println("比較実験:" + h + "と" + i + "とで大きい方は・・・" + l);

//		文字列を数値に変換する命令
		String age1 = "31";
		int n = Integer.parseInt(age1);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね");

//		乱数を生み出して代入する命令文
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分、" + r + "歳ですかね？");

//		キーボードから入力を受け付ける文
		System.out.println("あなたの名前を入力してください");
		String Name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int Age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + Age + "歳の"  + Name + "さん");

	}

}
