
public class Lesson4 {

	public static void main(String[] args) {

//		練習問題4-2
		int[] moneyList = new int[] {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int list : moneyList) {
			System.out.println(list);
		}

//		練習問題4-4
		int[] numbers = new int [] {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int n : numbers) {
			if (n == input) {
				System.out.println("当たり！");
			}
		}

	}

}
