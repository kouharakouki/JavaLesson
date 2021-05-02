
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

		String name = "すがわら";
		String message = name + "さん、こんにちは！";
		System.out.println(message);

	}

}
