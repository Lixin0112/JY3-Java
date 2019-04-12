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

//����һ����ӡѧ����Ϣ��ͷ�ķ�����
	public void showStudentField() {
		System.out.println("-----------------------------------  ѧ����Ϣ  -----------------------------------");
		System.out.println("|ѧ��\t|����\t|����\t|�Ա�\t|�꼶\t|�绰\t\t|EMAIL\t\t|��ַ");
		System.out.println("------------------------------------------------------------------------------");
	}

//����һ����ѯָ��idѧ����Ϣ�ķ�����
	public void showStudent() {
		System.out.print("������Ҫ��ѯ��id��");
		int x = sc.nextInt();
		while (x >= students.length || x < 0 || students[x] == null) {
			System.out.println("��id�����ڣ����������룺");
			x = sc.nextInt();
		}
		this.showStudentField();
		System.out.println(
				"|"+students[x].id+"\t|"+students[x].name+"\t|"+students[x].age+"\t|"+students[x].sex+"\t|"+students[x].grade+"\t|"+students[x].telephoneNum+"\t|"+students[x].email+"\t|"+students[x].adress);
		System.out.println("------------------------------------------------------------------------------");
	}

//����һ����ѯ����ѧ����Ϣ�ķ�����
	public void showStudents() {
		if (students.length != 0) {
			this.showStudentField();
			// ��������name���Բ�Ϊ�յĳ�Ա��Ϣ��
			for (int i = 0; i < students.length; i++) {
				if (students[i]!= null) {
					System.out.println(
							"|"+students[i].id+"\t|"+students[i].name+"\t|"+students[i].age+"\t|"+students[i].sex+"\t|"+students[i].grade+"\t|"+students[i].telephoneNum+"\t|"+students[i].email+"\t|"+students[i].adress);
					System.out
							.println("------------------------------------------------------------------------------");
				}
			}
		} else {
			System.out.println("��ǰϵͳ��ѧ����Ϣ��");
		}
	}

//����һ����ѯָ��idѧ���������ķ�����
	public void showName() {
		System.out.print("������Ҫ��ѯ��id��");
		int x = sc.nextInt();
		while (x >= students.length || x < 0 || students[x] == null) {
			System.out.println("��id�����ڣ����������룺");
			x = sc.nextInt();
		}
		System.out.println("��id��ѧ������Ϊ��" + students[x].name);
	}

//����һ�����ѧ���ķ�����
	public void addStudent() {
		System.out.println("***********************************���ѧ����Ϣ***********************************");
		System.out.print("������ѧ��id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] != null) {
			if (id < 0) {
				System.out.println("idֻ����0��ʼ����Ȼ�������������룡");
				System.out.println("������ѧ��id:");
				id = sc.nextInt();
			} else if (id >= students.length) {
				students = Arrays.copyOf(students, id + 1);
			} else {
				System.out.println("��id" + id + "�Ѵ������������룡");
				System.out.println("������ѧ��id:");
				id = sc.nextInt();
			}
		}
		students[id] = new Student();
		students[id].setId(id);
		System.out.println("������ѧ��������");
		students[id].setName(sc.next());
		System.out.println("������ѧ���Ա�");
		students[id].setSex(sc.next());
		System.out.println("������ѧ������(ֻ��1-120֮�������)��");
		students[id].setAge(sc.nextInt());
		System.out.println("������ѧ�������꼶(ֻ�ܳ������м����߼�)��");
		students[id].setGrade(sc.next());
		System.out.println("������ѧ����ַ��");
		students[id].setAdress(sc.next());
		System.out.println("������ѧ����ϵ��ʽ(11λ�ֻ�����)��");
		students[id].setTelephoneNum(sc.next());
		System.out.println("������ѧ����������(����@��.com)��");
		students[id].setEmail(sc.next());
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
	}

//����һ��ɾ��ѧ���ķ�����
	public void deleteStudent() {
		System.out.print("������Ҫɾ����ѧ��id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] == null) {
			if (id < 0) {
				System.out.println("idֻ����0��ʼ����Ȼ�������������룡");
			} else if (id >= students.length) {
				System.out.println("��id" + id + "��������");
			} else {
				System.out.println("��id" + id + "��������");
			}
			System.out.println("������ѧ��id:");
			id = sc.nextInt();
		}
		students[id] = null;
		System.out.println("����ɾ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
	}

//����һ������id�޸�ѧ��������Ϣ�ķ�����
	public void alterAll() {
		System.out.print("������Ҫ�޸ĵ�ѧ��id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] == null) {
			if (id < 0) {
				System.out.println("idֻ����0��ʼ����Ȼ�������������룡");
			} else if (id >= students.length) {
				System.out.println("��id" + id + "��������");
			} else {
				System.out.println("��id" + id + "��������");
			}
			System.out.println("������ѧ��id:");
			id = sc.nextInt();
		}
		System.out.println("�������µ�ѧ��������");
		students[id].setName(sc.next());
		System.out.println("�������µ�ѧ���Ա�");
		students[id].setSex(sc.next());
		System.out.println("�������µ�ѧ������(ֻ��1-120֮�������)��");
		students[id].setAge(sc.nextInt());
		System.out.println("�������µ�ѧ�������꼶(ֻ�ܳ������м����߼�)��");
		students[id].setGrade(sc.next());
		System.out.println("�������µ�ѧ����ַ��");
		students[id].setAdress(sc.next());
		System.out.println("�������µ�ѧ����ϵ��ʽ(11λ�ֻ�����)��");
		students[id].setTelephoneNum(sc.next());
		System.out.println("�������µ�ѧ����������(����@��.com)��");
		students[id].setEmail(sc.next());
	}

//����һ������id�޸�ѧ��ָ����Ϣ�ķ�����
	public void alter() {
		System.out.print("������Ҫ�޸ĵ�ѧ��id:");
		int id = sc.nextInt();
		while (id < 0 || id >= students.length || students[id] == null) {
			if (id < 0) {
				System.out.println("idֻ����0��ʼ����Ȼ�������������룡");
			} else if (id >= students.length) {
				System.out.println("��id" + id + "��������");
			} else {
				System.out.println("��id" + id + "��������");
			}
			System.out.println("������ѧ��id:");
			id = sc.nextInt();
		}
		System.out.print("������Ҫ�޸ĵ����ԣ�");
		String x=sc.next();
		while(!x.equals("name")&&!x.equals("sex")&&!x.equals("age")&&!x.equals("grade")&&!x.equals("adress")&&!x.equals("telephoneNum")&&!x.equals("email")) {
			System.out.print("�޴����ԣ����֤����������:");
			x=sc.next();
		}
		switch (x) {
		case "name":
			System.out.println("�������µ�ѧ��������");
			students[id].setName(sc.next());
			break;
		case "sex":
			System.out.println("�������µ�ѧ���Ա�");
			students[id].setSex(sc.next());
			break;
		case "age":
			System.out.println("�������µ�ѧ������(ֻ��1-120֮�������)��");
			students[id].setAge(sc.nextInt());
			break;
		case "grade":
			System.out.println("�������µ�ѧ�������꼶(ֻ�ܳ������м����߼�)��");
			students[id].setGrade(sc.next());
			break;
		case "adress":
			System.out.println("�������µ�ѧ����ַ��");
			students[id].setAdress(sc.next());
			break;
		case "telephoneNum":
			System.out.println("�������µ�ѧ����ϵ��ʽ(11λ�ֻ�����)��");
			students[id].setTelephoneNum(sc.next());
			break;
		case "email":
			System.out.println("�������µ�ѧ����������(����@��.com)��");
			students[id].setEmail(sc.next());
			break;
		}
	}
}
