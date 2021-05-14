
public class Wand {

	private String name;
	private double power;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name.length() < 3 || name == null) {
			throw new IllegalArgumentException("名前は３文字以上必要です");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖のパワーが異常です");
		}
		this.power = power;
	}

}
