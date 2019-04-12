package studentManagementSystem;

import java.util.Scanner;

public class Login {
	static String user = "admin";
	static String password = "admin";

	public static boolean login() {
		System.out.println("-----------------------------------欢迎登录学生信息管理系统-----------------------------------");
		System.out.println("1.登录					2.退出");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.print("请选择：");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		while (choose != 1 && choose != 2) {
			System.out.println("请从两个选项中选择！请重新输入！");
			choose = sc.nextInt();
		}
		if (choose == 1) {
			System.out.println("欢迎登陆！");
			System.out.println("请输入用户名：");
			String userIn = sc.next();
			System.out.println("请输入密码：");
			String passwordIn = sc.next();
			while (!userIn.equals( Login.user) |!passwordIn.equals( Login.password)  ) {
				System.out.println("用户名或密码错误请查证后重新输入");
				System.out.println("请输入用户名：");
				userIn = sc.next();
				System.out.println("请输入密码：");
				passwordIn = sc.next();
			}
			System.out.println("登陆成功");
//			sc.close();
			return true;
		} else {
			System.out.println("退出成功");
			sc.close();
			return false;
		}
		
	}

}
