package studentManagementSystem;

import java.util.Scanner;

public class Login {
	static String user = "admin";
	static String password = "admin";

	public static boolean login() {
		System.out.println("-----------------------------------��ӭ��¼ѧ����Ϣ����ϵͳ-----------------------------------");
		System.out.println("1.��¼					2.�˳�");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.print("��ѡ��");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		while (choose != 1 && choose != 2) {
			System.out.println("�������ѡ����ѡ�����������룡");
			choose = sc.nextInt();
		}
		if (choose == 1) {
			System.out.println("��ӭ��½��");
			System.out.println("�������û�����");
			String userIn = sc.next();
			System.out.println("���������룺");
			String passwordIn = sc.next();
			while (!userIn.equals( Login.user) |!passwordIn.equals( Login.password)  ) {
				System.out.println("�û���������������֤����������");
				System.out.println("�������û�����");
				userIn = sc.next();
				System.out.println("���������룺");
				passwordIn = sc.next();
			}
			System.out.println("��½�ɹ�");
//			sc.close();
			return true;
		} else {
			System.out.println("�˳��ɹ�");
			sc.close();
			return false;
		}
		
	}

}
