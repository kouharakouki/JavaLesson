import java.io.FileWriter;

//例外処理を学ぶ
public class Chapter17 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		} catch(Exception e) {
			System.out.println("何らかのエラーが発生しました");
		} finally {

		}
	}

}
