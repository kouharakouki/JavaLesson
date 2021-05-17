import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson16 {

	public static void main(String[] args) {
		Hero16 h1 = new Hero16("斎藤");
		Hero16 h2 = new Hero16("鈴木");


		List<String> names = new ArrayList<String>();
		names.add(h1.getName());
		names.add(h2.getName());

		for (String s : names) {
			System.out.println(s);
		}


		Map<Hero16, Integer> heroes = new HashMap<Hero16, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		for (Hero16 key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵の数は" + value);
		}
	}

}
