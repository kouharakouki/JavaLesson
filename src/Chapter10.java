
public class Chapter10 {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		sh.run();

		Hero h = new Hero("ミナト");
		h.run();

		Weapon w = new Weapon();
		System.out.println(w.name);
	}

}
