
public class Matango {

	int hp = 50;
	final int LEVEL = 10;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public Matango() {

	}

	public void attack(Hero h) {
		System.out.println("きのこ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}

	public void run() {
		System.out.println("お化けきのこ" + this.suffix + "は逃げ出した！");
	}

}
