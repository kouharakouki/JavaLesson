
public class Lesson {

	public static void main(String[] args) {

//		コメントの入れ方
		System.out.println("Hello Java");
		System.out.println(17);
		System.out.println("5 + 3");
		System.out.println(5 + 3);
		System.out.println(8 / 2);
		System.out.println(10 % 3);
		System.out.println("Hello" + "Java");
		System.out.println("10" + "10");

		int number;
		number = 5;
		System.out.println(number);

		String name;
		name = "太郎";
		System.out.println(name);
		System.out.println("こんにちは" + name);

		int number2 = 10;
		System.out.println(number * number2);
		number2 = 5;
		System.out.println(number * number2);
		number2 = number + 5;
		System.out.println(number * number2);
		number2 += 5;
		System.out.println(number2);

		int length = 6;
		int height = 8;
		int triangleArea = length * height / 2;
		System.out.println(triangleArea);

		double number3 = 3.5;
		double number4 = 3.5;
		System.out.println(number3 + number4);

		System.out.println(7 / 2);
		System.out.println(7.0 / 2.0);
		System.out.println(7 / 2.0);

		System.out.println(number2 / number);
		System.out.println((double)number2 / number);

		System.out.println(12 / 4 == 3);
		System.out.println(12 / 4 != 3);
		boolean bool;
		bool = 3 * 9 == 27;
		System.out.println(bool);

		System.out.println(8 < 5);
		System.out.println(3 >= 2);

		System.out.println(8 < 5 && 3 >= 2);
		System.out.println(8 < 5 || 3 >= 2);
		System.out.println(!(8 < 5));

		int x = 5;
		if (x > 2) {
			System.out.println("xは2より大きい");
		}

		int number1 = 12;
		if (number1 < 10) {
			System.out.println("10より小さい");
		} else if (number < 20) {
			System.out.println("10以上、20より小さい");
		} else {
			System.out.println("20以上");
		}

		switch (number1 % 3) {
			case 0:
				System.out.println("3で割り切れます");
				break;
			case 1:
				System.out.println("3で割ると1余ります");
				break;
			case 2:
				System.out.println("3で割ると2余ります");
				break;
		}

		switch (number1 % 5) {
			case 0:
				System.out.println("大吉です");
				break;
			case 1:
				System.out.println("中吉です");
				break;
			case 4:
				System.out.println("凶です");
				break;
			default:
				System.out.println("吉です");
				break;
		}

		int number5 = 10;

		while (number5 > 0) {
			System.out.println(number5);
			number5--;
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "回目のループです");
		}

	}

}
