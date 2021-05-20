
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
	}

}
