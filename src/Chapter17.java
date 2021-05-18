import java.io.FileWriter;
import java.io.IOException;

//例外処理を学ぶ
public class Chapter17 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch(Exception e) {
			System.out.println("何らかのエラーが発生しました");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch(IOException e) {
					;
				}
			}
		}

//		上記の文を簡潔にまとめることもできる
		try (FileWriter file = new FileWriter("data.txt");) {
			file.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}


		try {
			throw new UnsupportedMusicFileException
				("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
