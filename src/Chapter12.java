
//多態性について
public class Chapter12 {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matango();

		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);

		Monster ms = new Slime();
		Slime s = new Slime();

		ms.run();
		s.run();
	}

}
