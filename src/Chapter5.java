
public class Chapter5 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();
		methodA();
		HELLO("湊");
		HELLO("朝香");
		add(100, 20);
		add(200, 50);
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

}
