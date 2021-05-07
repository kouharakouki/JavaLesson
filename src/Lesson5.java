
public class Lesson5 {

//	練習問題5-1
	public static void introduceOneself() {
		String name = "太郎";
		int age = 20;
		double height = 170.0;
		char zodiac = '牛';
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("身長は" + height + "です");
		System.out.println("干支は" + zodiac + "です");
	}


//	練習問題5-2
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}


//	練習問題5-3
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}


//	練習問題5-4
	public static double calcTriangleArea(double bottom, double height) {
		double triangle = bottom * height / 2;
		return triangle;
	}
	public static double calcCircleArea(double radius) {
		double circle = radius * radius * 3.14;
		return circle;
	}


	public static void main(String[] args) {
		introduceOneself();
		email("練習問題です", "taro@tarotaro", "本文の内容はこちらです");
		String address = "test@test";
		String text = "オーバーロードのテストです";
		email(address, text);
		double triangle = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + triangle);
		double circle = calcCircleArea(5.0);
		System.out.println("円の面積は" + circle);
	}

}
