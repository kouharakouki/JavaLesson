
public class Chapter4Ver2 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		int num = scores.length;
		System.out.println(num);

		scores[0] = 30;
		System.out.println(scores[0]);


		int[] scores1 = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int i = 0; i < scores1.length; i++) {
			sum += scores1[i];
		}
		System.out.println(sum);

		for (int i : scores1) {
			System.out.println(i);
		}

	}
}
