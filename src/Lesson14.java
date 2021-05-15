
public class Lesson14 {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;

		Account b = new Account();
		b.accountNumber = " 4649";
		b.balance = 1592;

		System.out.println(a);

		if (a.equals(b) == true) {
			System.out.println("口座番号は同じです");
		} else {
			System.out.println("口座番号が違います");
		}
	}

}
