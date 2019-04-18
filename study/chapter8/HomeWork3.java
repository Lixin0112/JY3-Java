package com.neuedu.study.chapter8;

//import java.util.Scanner;

public class HomeWork3 {
    String a;
    String b;
	public static void main(String[] args) {
		HomeWork3 h = new HomeWork3();
		h.b="aaa";
		try {
			System.out.println(h.compare());
		} catch (NullPointerException e) {

			e.printStackTrace();
		}

	}

	public boolean compare() throws NullPointerException {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("请输入第一个字符串：");
//		String a = sc.next();
//		System.out.println("请输入第二个字符串：");
//		String b = sc.next();
//		sc.close();
		
		if (this.a.equals(this.b)) {
			return true;
		} else {
			return false;
		}

	}
}
