
public class Chapter15 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

//		文字列調査メソッド
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}

		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs３はケースを区別しなければ等しい");
		}

		System.out.println("s1の長さは" + s1.length() + "です");

		if (s1.isEmpty()) {
			System.out.println("s1はから文字です");
		}

//		文字列検索メソッド
		String s4 = "Java and JavaScript";
		if (s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}
		if (s4.endsWith("Java")) {
			System.out.println("文字列s4は、Javaが末尾にあります");
		}
		System.out.println("文字列s4で、最初にJavaが登場する位置は" + s4.indexOf("Java"));
		System.out.println("文字列s4で、最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));


//		文字列切り出しメソッド
		String s5 = "Java Programming";
		System.out.println("文字列s5の4文字目は" + s5.charAt(3));
		System.out.println("文字列s5の４文字目以降は" + s5.substring(3));
		System.out.println("文字列s5の４〜８文字目は" + s5.substring(3, 8));

//		文字列の変換メソッド
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());

//		文字列を連結するクラス
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append("Java");
		}
		System.out.println(sb.toString());

//		文字列の分割
		String s6 = "abc,def:ghi";
		String[] words = s6.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}

//		文字列の置き換え
		String s7 = "abc,def:ghi";
		String w = s7.replaceAll("[beh]", "X");
		System.out.println(w);

		System.out.printf("製品番号%s-%02d", "SJV", 3);

		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は・・・" + (end-start) + "ミリ秒でした");
	}

//	文字を判定するメソッド
	public boolean isValidPlayerName(String name) {
		if (name.length() != 8) {
			return false;
		}
		char first = name.charAt(0);
		if (!(first >= 'A' && first <= 'Z')) {
			return false;
		}
		for (int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if(!((c >= 'A' && c <='Z') || (c >= '0' && c >= '9'))) {
				return false;
			}
		}
		return true;
	}

//	上記の判定メソッドをmatchesメソッドを使う→パターンマッチング
	public boolean isValidPlayerName1(String name) {
		return name.matches("[A-Z][A-z0-9]{7}");
	}



}
