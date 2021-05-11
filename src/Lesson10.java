
public class Lesson10 {

	public static void main(String[] args) {
		Hero h = new Hero("こうき");
		PoisonMatango pm = new PoisonMatango('A');
		Sword s = new Sword();

		s.name = "炎の剣";
		s.damage = 10;

		h.sword = s;

		System.out.println("勇者" + h.name + "が誕生した。HPは" + h.hp);
		System.out.println("毒キノコ" + pm.suffix + "は、HPが" + pm.hp + "あり、レベルは" + pm.LEVEL + "である。");

		pm.attack(h);
		System.out.println("勇者のHPは残り" + h.hp);

		h.sleep();
		System.out.println("勇者のHPは残り" + h.hp);

		pm.attack(h);
		pm.attack(h);
		System.out.println("勇者のHPは残り" + h.hp);

		h.attack();
		h.attack();

		pm.run();
	}

}
