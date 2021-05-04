
public class Chapter4 {

	public static void main(String[] args) {

//		点数管理プログラム→配列を使えば不便がなくなる
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;

		int sum = sansu + kokugo +rika + eigo + syakai;

		int avg = sum / 5;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);


//		配列の作成手順
		int[] scores;
		scores = new int[5];
//		int[] scores = new int[5]; 1行にまとめることも可能

//		配列の長さを調べる
		int num = scores.length;
		System.out.println("要素の数：" + num);

//		配列の要素に値を代入
		scores[1] = 30;
		System.out.println(scores[1]);

//		配列を用いた点数管理プログラム
		int[] score = {20, 30, 40, 50, 80};
		int SUM = score[0] + score[1] + score[2] + score[3] + score[4];
		int AVG = SUM / score.length;
		System.out.println("合計点" + SUM);
		System.out.println("平均点" + AVG);

//		for文を使って配列を扱う
//		ループによる全要素の利用
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
//		拡張for文
		for (int value : score) {
			System.out.println(value);
		}

//		点数管理プログラム（for文の利用）
		int Sum = 0;
		for (int i = 0; i < score.length; i++) {
			Sum += score[i];
		}
		System.out.println(Sum);

//		50点以上の科目の数を調べる
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目のが数は" + count);

//		DNAの記号をランダムに表示する
		int[] seq = new int[10];

		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}

		for (int i = 0; i < seq.length; i++) {
			switch (seq[i]) {
				case 0:
					System.out.print("A");
					break;
				case 1:
					System.out.print("T");
					break;
				case 2:
					System.out.print("G");
					break;
				case 3:
					System.out.print("C");
					break;
			}
		}

//		配列の舞台裏
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
	}

}
