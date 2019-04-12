package studentManagementSystem;

import java.util.Scanner;

public class Test {

	public void mainMenu() {
		System.out.println("*********************************** ��ѡ��Ҫ��������Ϣ��Ӧ����  ***********************************");
		System.out.println("*1.�鿴ѧ����Ϣ	2.���ѧ����Ϣ	3.ɾ��ѧ����Ϣ	 4.�޸�ѧ����Ϣ 	 5.�˳�                   *");
		System.out.println("*****************************************************************************************");
		System.out.print("��ѡ��:");
	}

	public void checkMenu() {
		System.out.println("+++++++++++++++++++++++++++++++++++ ��ѡ��Ҫ��������Ϣ��Ӧ����  +++++++++++++++++++++++++++++++++++");
		System.out.println("+	1.�鿴����ѧ����Ϣ	2.����id��ѯѧ����Ϣ	3.����id��ѯѧ������	4.������һ��	+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("��ѡ��:");
	}

	public void alterMenu() {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("1.����id�޸�ѧ����ȫ����Ϣ	2.����id�޸�ѧ����ָ����Ϣ	3.�����ϼ�Ŀ¼ 	4.ϵͳ�˳�	");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.print("��ѡ��:");
	}

	public static void main(String[] args) {
		Test test = new Test();
		Student stu = new Student();
//ֻҪ�ڵ�¼״̬�¾�һֱѭ��ѡ���ܲ�ʵ�֣�
		boolean go = Login.login();
		while (go) {
//������˵���ѡ���ܣ�	
			Scanner sc = new Scanner(System.in);
			test.mainMenu();
			int x = sc.nextInt();
			switch (x) {
			case 1:
//�����ѯ�˵���չʾ���ܣ�
				test.checkMenu();
				int option = sc.nextInt();
//				���벻���ڵ�ѡ�ѭ������ֱ����ȷ��
				while (option != 1 && option != 2 && option != 3 && option != 4) {
					System.out.println("ֻ�ܴ����ϲ˵�������ѡ������������!");
					option = sc.nextInt();
				}
//				��ѡ��4���˳��������ϲ㣩�����๦�ܿ�ʵ�֣�����ʵ�ֺ�����ڱ���˵���ѡ��
				while (option != 4) {
					switch (option) {
					case 1:
						stu.showStudents();
						break;
					case 2:
						stu.showStudent();
						break;
					case 3:
						stu.showName();
						break;
					}
					System.out.println("��ѯ��ϣ����ز˵�������");
					test.checkMenu();
					option = sc.nextInt();
//				���벻���ڵ�ѡ�ѭ������ֱ����ȷ��
					while (option != 1 && option != 2 && option != 3 && option != 4) {
						System.out.println("ֻ�ܴ����ϲ˵�������ѡ������������!");
						option = sc.nextInt();
					}
				}
				break;
			case 2:
//�������ѧ���ķ�����
				stu.addStudent();
				break;
			case 3:
//����ɾ��ѧ���ķ�����
				stu.deleteStudent();
				break;
			case 4:
//�����޸Ĺ��ܣ���ʾ�˵���
				test.alterMenu();
				int options = sc.nextInt();
//				���벻���ڵ�ѡ�ѭ������ֱ����ȷ��
				while (options != 1 && options != 2 && options != 3 && options != 4) {
					System.out.println("ֻ�ܴ����ϲ˵�������ѡ������������!");
					options = sc.nextInt();
				}
				while (options != 3 && options != 4) {
					switch (options) {
					case 1:
//             ���÷����޸��������ԣ�
						stu.alterAll();
						break;
					case 2:
//             ���÷����޸�ָ��������Ϣ��
						stu.alter();
						break;
					}
					System.out.println("�޸ĳɹ������ز˵�������");
					test.alterMenu();
					options = sc.nextInt();
//				���벻���ڵ�ѡ�ѭ������ֱ����ȷ��
					while (options != 1 && options != 2 && options != 3 && options != 4) {
						System.out.println("ֻ�ܴ����ϲ˵�������ѡ������������!");
						options = sc.nextInt();
					}
				}

				if (options == 4) {
					System.out.println("���˳�����ϵͳ��");
					sc.close();
					return;
				}
				break;
			case 5:
				System.out.println("���˳�����ϵͳ��");
				sc.close();
				return;
			default:
				System.out.println("������ϲ˵�������ѡ������!");
				break;
			}

		}

	}

}
