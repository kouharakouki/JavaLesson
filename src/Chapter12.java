
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


//		多態性と配列の組み合わせ
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();

		for (Character ch : c) {
			ch.hp += 50;
		}
	}

}
