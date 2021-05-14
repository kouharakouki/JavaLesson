
public class Hero extends Character {

	Sword sword;

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		this("ダミー");
		System.out.println("Heroのコンストラクタが作動");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃をした");
		System.out.println("敵に" + this.sword.damage + "ポイントのダメージを与えた！");
		System.out.println("お化けキノコ" + m.suffix + "から２ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}

	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した");
	}

//	継承時にオーバーライドさせないようにfinalをつける
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5のダメージ");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

//	カプセル化（他のクラスから呼び出されないように）
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}

}
