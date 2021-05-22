
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

		int j = 1;
		while (j < 10) {
			if (j % 5 == 0) {
				break;
			}
			System.out.println(j);
			j++;
		}

		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

		String names[] = {"ゼロ", "一郎", "次郎",};
		System.out.println(names[0]);
		System.out.println(names[2]);
		names[0] = "zero";
		System.out.println(names[0]);

		for (int i = 0; i < names.length; i++) {
			System.out.println("私の名前は" + names[i] + "です");
		}

		for (String name1 : names) {
			System.out.println("私の名前は" + name1 + "です");
		}

		int numbers1[] = {1, 4, 6, 9, 13, 16};

		int oddSum = 0;
		int evenSum = 0;

		for (int numberx : numbers1) {
			if (numberx % 2 == 0) {
				evenSum += numberx;
			} else {
				oddSum += numberx;
			}
		}
		System.out.println("奇数の和は" + oddSum + "です");
		System.out.println("偶数の和は" + evenSum + "です");

	}

}
