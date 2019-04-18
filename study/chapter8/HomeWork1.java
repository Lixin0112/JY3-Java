package com.neuedu.study.chapter8;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		try {
			String a = sr.next();
			String b = sr.next();
			System.out.println(Integer.parseInt(a) / Integer.parseInt(b));

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			sr.close();
			System.out.println("总是被执行");
		}
	}

}
