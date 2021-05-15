
public class Chapter14 {

	public static void main(String[] args) {
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);

		IronMan im = new IronMan();
		System.out.println(im.toString());
	}

	public void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
