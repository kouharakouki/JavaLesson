
public class Lesson8 {

	public static void main(String[] args) {
		Cleric h = new Cleric();
		h.name = "ミナト";
		System.out.println("聖職者" + h.name + "を生み出しました");

		h.selfAid();

		System.out.println("残りMP" + h.mp);

		h.pray(1);

		System.out.println("残りMP" + h.mp);
	}

}
