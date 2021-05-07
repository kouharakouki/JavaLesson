
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
		System.out.println(aDD(10, 20));
		System.out.println(aDD(10, 20, 30));

		int[] array = {1, 2, 3};
		printArray(array);

		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}

		int[] Array = makeArray(3);
		for (int i : Array) {
			System.out.println(i);
		}

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

//	オーバーロード（引数の数が異なる場合）
	public static int aDD(int x, int y) {
		return x + y;
	}
	public static int aDD(int x, int y, int z) {
		return x + y + z;
	}

//	引数に配列を受け取るメソッドを利用
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}


}
