import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Chapter16 {

	public static void main(String[] args) {
//		ArrayListの使い方
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}

//		要素を取り出す方法（イテレータ）
		ArrayList<String> names = new ArrayList<>();
		names.add("みなと");
		names.add("アサカ");
		names.add("菅原");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}


//		setクラスの使い方
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		System.out.println("色は" + colors.size() + "種類あります");
		for (String s : colors) {
			System.out.println(s);
		}


//		setクラスの中身を取り出す順番（辞書順）
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.print(s + "→");
		}
	}

}
