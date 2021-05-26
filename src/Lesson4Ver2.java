
public class Lesson4Ver2 {

	public static void main(String[] args) {
		int moneyList[] = {121902, 8302, 55100};

		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		for (int list : moneyList) {
			System.out.println(list);
		}


		int numbers[] = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i : numbers) {
			if (input == i) {
				System.out.println("あたり！");
			}
		}
	}

}
