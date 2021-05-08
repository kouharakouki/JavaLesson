package calcapp.main;

import calcapp.logics.CalcLogic;

public class Calc {

//	ソースファイルを分割する
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "引くと" + delta);


//		APIの利用例（並び替えの命令）
		int[] heights = {172, 149, 152, 191, 155};
		java.util.Arrays.sort(heights);
		for (int h : heights) {
			System.out.println(h);
		}
	}

}
