
public class Chapter1 {

	public static void main(String[] args) {
		System.out.println("RPG:スッキリ魔王征伐");
		System.out.println("Ver.0.1 by 湊");
		System.out.println("<ただいま鋭意学集中・製作中>");
		System.out.println("プログラムを終了します");

		int age;
		age = 20;
		System.out.println("私の年齢は" + age);
		age = 31;
		System.out.println("いや。本当の年齢は" + age);

		final double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は");
		System.out.println(pie * pie * pi);

//		練習問題1-2
		int a = 3;
		int b = 5;
		int c = a * b;
		System.out.println("縦幅3横幅5の長方形の面積は、" +c);

//		練習問題1-3
		boolean result = true;
		char favoriteCharacter = '駆';
		double aa = 3.14;
		long number = 314159265853979L;
		String msg = "ミナトの攻撃！敵に１５ポイントのダメージを与えた。";
	}
}
