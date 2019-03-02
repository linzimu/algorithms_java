package acm_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NeedKnow {
	public static void input() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();// 注意：nextLine会自动接收回车
		System.out.println("你输入的字符串：" + s);
		int i = sc.nextInt();
		System.out.println("你输入的整数：" + i);
		float f = sc.nextFloat();
		System.out.println("你输入的浮点数：" + f);
		sc.close();
	}

	public static void output() {
		int a = 12345;
		double b = 1.2345;
		System.out.println(a + " " + b);
		System.out.printf("%d %10.5f\n", a, b);
		DecimalFormat df1 = new DecimalFormat("#.00#");
		DecimalFormat df2 = new DecimalFormat("#.###");
		double x = 1.34264;
		System.out.println("x = " + df1.format(x));
		System.out.println("x = " + df2.format(x));
	}

	public static void deal_string() {
		String str = "abcdef";
		System.out.println(str.charAt(0));
		char[] chs = str.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " ");
			if (str.startsWith("a")) {
				System.out.println("ok");
				str = str.substring(1);
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input();
		// output();
		deal_string();
	}

}
