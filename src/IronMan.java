
public class IronMan {

	private String name;
	int hp;

//	静的フィールド
	static int money;

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof IronMan) {
			IronMan im = (IronMan)o;
			if(this.name.equals(im.name)) {
				return true;
			}
		}
		return false;
	}


	public String getName() {
		return this.name;
	}

	public String toString() {
		return "名前：" + this.getName() + "/HP：" + this.hp;
	}


	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException
				("名前がnullである。処理を中断");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException
				("名前が短すぎる。処理を中断");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException
				("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}

}
