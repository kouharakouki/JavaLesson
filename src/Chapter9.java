
public class Chapter9 {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero("ミナト");
		h1.sword = s;

		Hero h2 = new Hero();

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 100;

		Matango m = new Matango();

		System.out.println("現在の武器は" + h1.sword.name);
		h1.attack(m);

		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

		System.out.println(h1.name + "のHPは" + h1.hp + "です");
		System.out.println(h2.name + "のHPは" + h2.hp + "です");
	}

}
