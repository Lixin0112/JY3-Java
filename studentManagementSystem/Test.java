package studentManagementSystem;

import java.util.Scanner;

public class Test {

	public void mainMenu() {
		System.out.println("*********************************** 请选择要操作的信息对应数字  ***********************************");
		System.out.println("*1.查看学生信息	2.添加学生信息	3.删除学生信息	 4.修改学生信息 	 5.退出                   *");
		System.out.println("*****************************************************************************************");
		System.out.print("请选择:");
	}

	public void checkMenu() {
		System.out.println("+++++++++++++++++++++++++++++++++++ 请选择要操作的信息对应数字  +++++++++++++++++++++++++++++++++++");
		System.out.println("+	1.查看所有学生信息	2.根据id查询学生信息	3.根据id查询学生姓名	4.返回上一层	+");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("请选择:");
	}

	public void alterMenu() {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("1.根据id修改学生的全部信息	2.根据id修改学生的指定信息	3.返回上级目录 	4.系统退出	");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.print("请选择:");
	}

	public static void main(String[] args) {
		Test test = new Test();
		Student stu = new Student();
//只要在登录状态下就一直循环选择功能并实现：
		boolean go = Login.login();
		while (go) {
//输出主菜单，选择功能：	
			Scanner sc = new Scanner(System.in);
			test.mainMenu();
			int x = sc.nextInt();
			switch (x) {
			case 1:
//进入查询菜单，展示功能：
				test.checkMenu();
				int option = sc.nextInt();
//				输入不存在的选项将循环重输直到正确：
				while (option != 1 && option != 2 && option != 3 && option != 4) {
					System.out.println("只能从以上菜单数字中选择！请重新输入!");
					option = sc.nextInt();
				}
//				除选项4（退出并返回上层），其余功能可实现，并在实现后继续在本层菜单中选择
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
					System.out.println("查询完毕，返回菜单。。。");
					test.checkMenu();
					option = sc.nextInt();
//				输入不存在的选项将循环重输直到正确：
					while (option != 1 && option != 2 && option != 3 && option != 4) {
						System.out.println("只能从以上菜单数字中选择！请重新输入!");
						option = sc.nextInt();
					}
				}
				break;
			case 2:
//调用添加学生的方法：
				stu.addStudent();
				break;
			case 3:
//调用删除学生的方法：
				stu.deleteStudent();
				break;
			case 4:
//进入修改功能，显示菜单：
				test.alterMenu();
				int options = sc.nextInt();
//				输入不存在的选项将循环重输直到正确：
				while (options != 1 && options != 2 && options != 3 && options != 4) {
					System.out.println("只能从以上菜单数字中选择！请重新输入!");
					options = sc.nextInt();
				}
				while (options != 3 && options != 4) {
					switch (options) {
					case 1:
//             调用发放修改所有属性：
						stu.alterAll();
						break;
					case 2:
//             调用方法修改指定属性信息：
						stu.alter();
						break;
					}
					System.out.println("修改成功，返回菜单。。。");
					test.alterMenu();
					options = sc.nextInt();
//				输入不存在的选项将循环重输直到正确：
					while (options != 1 && options != 2 && options != 3 && options != 4) {
						System.out.println("只能从以上菜单数字中选择！请重新输入!");
						options = sc.nextInt();
					}
				}

				if (options == 4) {
					System.out.println("已退出管理系统！");
					sc.close();
					return;
				}
				break;
			case 5:
				System.out.println("已退出管理系统！");
				sc.close();
				return;
			default:
				System.out.println("请从以上菜单数字中选择输入!");
				break;
			}

		}

	}

}
