
public class Chapter13 {

	public static void main(String[] args) {
		IronMan im = new IronMan();

//		setterメソッドの中で値の妥当性をチェックする

		im.setName("トニー");
		System.out.println(im.getName());

		im.setName(null);
		System.out.println(im.getName());
	}

}
