import java.awt.FlowLayout;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chapter18 {

	public static void main(String[] args) throws Exception {

//		ファイルを読み書きする
		FileReader fr = new FileReader("data.txt");
		int input = fr.read();
		while (input != -1) {
			System.out.println((char)input);
			input = fr.read();
		}
		fr.close();

//		webページを取得
		URL u = new URL("https://book.impress.co.jp/");
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {
			char c = (char)i;
			System.out.print(c);
			i = is.read();
		}

//		ウィンドウアプリケーション構成
		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hello World");
		JButton button = new JButton("押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

}
