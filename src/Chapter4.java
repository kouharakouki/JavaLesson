
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
	}

}
