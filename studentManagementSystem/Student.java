package studentManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String sex;
	private int age;
	private String grade;
	private String adress;
	private String telephoneNum;
	private String email;
	public static Student[] students = {};

	public Student() {
	}

	public Student(int id, String name, String sex, int age, String grade, String adress, String telephoneNum,
			String email) {
		this.setId(id);
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
		this.setGrade(grade);
		this.setAdress(adress);
		this.setTelephoneNum(telephoneNum);
		this.setEmail(email);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephoneNum() {
		return telephoneNum;
	}

	public void setTelephoneNum(String telephoneNum) {
		this.telephoneNum = telephoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	Scanner sc = new Scanner(System.in);

//定义一个打印学生信息表头的方法：
	public void showStudentField() {
		System.out.println("-----------------------------------  学生信息  -----------------------------------");
		System.out.println("|学号\t|姓名\t|年龄\t|性别\t|年级\t|电话\t\t|EMAIL\t\t|地址");
		System.out.println("------------------------------------------------------------------------------");
	}

//定义一个查询指定id学生信息的方法：
	public void showStudent() {
		System.out.print("请输入要查询的id：");
		int x = sc.nextInt();
		while (x >= students.length || x < 0 || students[x] == null) {
			System.out.println("该id不存在，请重新输入：");
			x = sc.nextInt();
		}
		this.showStudentField();
		System.out.println(
				"|"+students[x].id+"\t|"+students[x].name+"\t|"+students[x].age+"\t|"+students[x].sex+"\t|"+students[x].grade+"\t|"+students[x].telephoneNum+"\t|"+students[x].email+"\t|"+students[x].adress);
		System.out.println("------------------------------------------------------------------------------");
	}

//定义一个查询所有学生信息的方法：
	public void showStudents() {
		if (students.length != 0) {
			this.showStudentField();
			// 遍历所有name属性不为空的成员信息：
			for (int i = 0; i < students.length; i++) {
				if (students[i]!= null) {
					System.out.println(
							"|"+students[i].id+"\t|"+students[i].name+"\t|"+students[i].age+"\t|"+students[i].sex+"\t|"+students[i].grade+"\t|"+students[i].telephoneNum+"\t|"+students[i].email+"\t|"+students[i].adress);
					System.out
							.println("------------------------------------------------------------------------------");
				}
			}
		} else {
			System.out.println("当前系统无学生信息！");
		}
	}

//定义一个查询指定id学生的姓名的方法：
	public void showName() {
		System.out.print("请输入要查询的id：");
		int x = sc.nextInt();
		while (x >= students.length || x < 0 || students[x] == null) {
			System.out.println("该id不存在，请重新输入：");
			x = sc.nextInt();
		}
		System.out.println("该id的学生姓名为：" + students[x].name);
	}

//定义一个添加学生的方法：
	public void addStudent() {
		System.out.println("***********************************添加学生信息***********************************");
		System.out.print("请输入学生id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] != null) {
			if (id < 0) {
				System.out.println("id只能是0开始的自然数！请重新输入！");
				System.out.println("请输入学生id:");
				id = sc.nextInt();
			} else if (id >= students.length) {
				students = Arrays.copyOf(students, id + 1);
			} else {
				System.out.println("此id" + id + "已存在请重新输入！");
				System.out.println("请输入学生id:");
				id = sc.nextInt();
			}
		}
		students[id] = new Student();
		students[id].setId(id);
		System.out.println("请输入学生姓名：");
		students[id].setName(sc.next());
		System.out.println("请输入学生性别：");
		students[id].setSex(sc.next());
		System.out.println("请输入学生年龄(只能1-120之间的数字)：");
		students[id].setAge(sc.nextInt());
		System.out.println("请输入学生所属年级(只能初级、中级、高级)：");
		students[id].setGrade(sc.next());
		System.out.println("请输入学生地址：");
		students[id].setAdress(sc.next());
		System.out.println("请输入学生联系方式(11位手机号码)：");
		students[id].setTelephoneNum(sc.next());
		System.out.println("请输入学生电子邮箱(包含@和.com)：");
		students[id].setEmail(sc.next());
		System.out.println("数据保存成功，系统将自动返回上层目录~");
	}

//定义一个删除学生的方法：
	public void deleteStudent() {
		System.out.print("请输入要删除的学生id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] == null) {
			if (id < 0) {
				System.out.println("id只能是0开始的自然数！请重新输入！");
			} else if (id >= students.length) {
				System.out.println("此id" + id + "下无数据");
			} else {
				System.out.println("此id" + id + "下无数据");
			}
			System.out.println("请输入学生id:");
			id = sc.nextInt();
		}
		students[id] = null;
		System.out.println("数据删除成功，系统将自动返回上层目录~");
	}

//定义一个根据id修改学生所有信息的方法：
	public void alterAll() {
		System.out.print("请输入要修改的学生id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] == null) {
			if (id < 0) {
				System.out.println("id只能是0开始的自然数！请重新输入！");
			} else if (id >= students.length) {
				System.out.println("此id" + id + "下无数据");
			} else {
				System.out.println("此id" + id + "下无数据");
			}
			System.out.println("请输入学生id:");
			id = sc.nextInt();
		}
		System.out.println("请输入新的学生姓名：");
		students[id].setName(sc.next());
		System.out.println("请输入新的学生性别：");
		students[id].setSex(sc.next());
		System.out.println("请输入新的学生年龄(只能1-120之间的数字)：");
		students[id].setAge(sc.nextInt());
		System.out.println("请输入新的学生所属年级(只能初级、中级、高级)：");
		students[id].setGrade(sc.next());
		System.out.println("请输入新的学生地址：");
		students[id].setAdress(sc.next());
		System.out.println("请输入新的学生联系方式(11位手机号码)：");
		students[id].setTelephoneNum(sc.next());
		System.out.println("请输入新的学生电子邮箱(包含@和.com)：");
		students[id].setEmail(sc.next());
	}

//定义一个根据id修改学生指定信息的方法：
	public void alter() {
		System.out.print("请输入要修改的学生id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] == null) {
			if (id < 0) {
				System.out.println("id只能是0开始的自然数！请重新输入！");
			} else if (id >= students.length) {
				System.out.println("此id" + id + "下无数据");
			} else {
				System.out.println("此id" + id + "下无数据");
			}
			System.out.println("请输入学生id:");
			id = sc.nextInt();
		}
		System.out.print("请输入要修改的属性：");
		String x=sc.next();
		while(!x.equals("name")&&!x.equals("sex")&&!x.equals("age")&&!x.equals("grade")&&!x.equals("adress")&&!x.equals("telephoneNum")&&!x.equals("email")) {
			System.out.print("无此属性，请查证后重新输入:");
			x=sc.next();
		}
		switch (x) {
		case "name":
			System.out.println("请输入新的学生姓名：");
			students[id].setName(sc.next());
			break;
		case "sex":
			System.out.println("请输入新的学生性别：");
			students[id].setSex(sc.next());
			break;
		case "age":
			System.out.println("请输入新的学生年龄(只能1-120之间的数字)：");
			students[id].setAge(sc.nextInt());
			break;
		case "grade":
			System.out.println("请输入新的学生所属年级(只能初级、中级、高级)：");
			students[id].setGrade(sc.next());
			break;
		case "adress":
			System.out.println("请输入新的学生地址：");
			students[id].setAdress(sc.next());
			break;
		case "telephoneNum":
			System.out.println("请输入新的学生联系方式(11位手机号码)：");
			students[id].setTelephoneNum(sc.next());
			break;
		case "email":
			System.out.println("请输入新的学生电子邮箱(包含@和.com)：");
			students[id].setEmail(sc.next());
			break;
		}
	}
}
