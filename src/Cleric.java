
//現実世界の聖職者「クレリック」を表現するクラス
//オブジェクト指向にて開発

public class Cleric {

	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name +"はセルフエイドを唱えた");
		System.out.println("HPを最大まで回復しました");
	}

	public int pray(int sec) {
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("祈りを捧げて、MP" + recoverActual + "を回復した");
		return recoverActual;
	}

}
