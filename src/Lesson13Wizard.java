
public class Lesson13Wizard {

	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	Hero h = new Hero("ヒーロー");

	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("mpの数値が異常です");
		}
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name.length() < 3 || name == null) {
			throw new IllegalArgumentException("名前は３文字以上必要です");
		}
		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖が装備されていません");
		}
		this.wand = wand;
	}


}
