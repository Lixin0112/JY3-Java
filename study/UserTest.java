package com.neuedu.study;
import java.util.Scanner;
public class UserTest {

	public static void main(String[] args) {
		User u=new User();
		Scanner sc=new Scanner(System.in);
		System.out.print("�������û�����");
		String usn=sc.next();
		System.out.print("���������룺");
		String psw=sc.next();
		sc.close();
        System.out.print(u.checkUser(usn, psw)==true?"��½�ɹ�":"��½ʧ��");
	    
	}

}
