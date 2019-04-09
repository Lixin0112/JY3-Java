package com.neuedu.study;
import java.util.Scanner;
public class UserTest {

	public static void main(String[] args) {
		User u=new User();
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入用户名：");
		String usn=sc.next();
		System.out.print("请输入密码：");
		String psw=sc.next();
		sc.close();
        System.out.print(u.checkUser(usn, psw)==true?"登陆成功":"登陆失败");
	    
	}

}
