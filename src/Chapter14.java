
public class Chapter14 {

	public static void main(String[] args) {
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);


//		Objectクラスの存在価値
//		toString()
		IronMan im = new IronMan();
		System.out.println(im.toString());

//		equals()
		IronMan im1 = new IronMan();
		im1.setName("アイアンマン");
		im1.hp = 10;
		IronMan im2 = new IronMan();
		im2.setName("アイアンマン");
		im2.hp = 10;

		if (im1.equals(im2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}

		if (im1 == im2) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}

//		静的フィールド
		IronMan.money = 100;

		System.out.println(IronMan.money);
		System.out.println(im1.money);
		im1.money = 300;
		System.out.println(im2.money);

		IronMan.setRandomMp();
		System.out.println(IronMan.mp);
		IronMan im3 = new IronMan();
		System.out.println(im3.mp);

	}

	public void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
