
public class Chapter5 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();
		methodA();
		HELLO("湊");
		HELLO("朝香");
		add(100, 20);
		add(200, 50);
		int ans = ADD(100, 10);
		System.out.println("100 + 10 =" + ans);
		System.out.println(Add(10, 20));
		System.out.println(Add("Hello", "World"));
		System.out.println(Add(3.5, 2.7));
		System.out.println("メソッドの呼び出しが終わりました");
	}

//	helloメソッドの定義
	public static void hello() {
		System.out.println("湊さん、こんにちは");
	}


//	mainメソッド以外からメソッドを呼び出す
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}

//	引数の例
	public static void HELLO(String name) {
		System.out.println(name + "さん、こんにちは");
	}

//	渡す値が複数の場合
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

	public static int ADD(int x, int y) {
		int ans = x + y;
		return ans;
	}

//	オーバーロード（引数の型が異なる）
	public static int Add(int x, int y) {
		return x + y;
	}
	public static double Add(double x, double y) {
		return x + y;
	}
	public static String Add(String x, String y) {
		return x + y;
	}


}
