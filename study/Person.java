package com.neuedu.study;

public class Person {
String num;
String name;
char sex;
int age;
char marriageStatus;
String numID;
String address;
String telephoneNum;
String fere;

public boolean marriage(Person p) {
	if(this.sex=='��'&&p.sex=='Ů'&&this.age>=22&&p.age>=20&&this.marriageStatus=='��'&&p.marriageStatus=='��'){
		this.marriageStatus='��';
		this.fere=p.name;
		p.marriageStatus='��';
		p.fere=this.name;
		return true;
	}else if(this.sex=='Ů'&&p.sex=='��'&&this.age>=20&&p.age>=22&&this.marriageStatus=='��'&&p.marriageStatus=='��'){
		this.marriageStatus='��';
		this.fere=p.name;
		p.marriageStatus='��';
		p.fere=this.name;
		return true;
	}else {return false;}
	
}

public static void main(String[] args) {
	Person p1=new Person();
	p1.sex='��';
	p1.name="�ܺ�";
	p1.marriageStatus='��';
	p1.age=22;
	Person p2=new Person();
	p2.sex='Ů';
	p2.name="��溵t";
	p2.marriageStatus='��';
	p2.age=20;
	System.out.println(p1.name+"��"+p2.name+"�����ô��"+p1.marriage(p2));
	System.out.println(p1.name+"���"+p1.marriageStatus);
	System.out.println(p1.name+"�İ����ǣ�"+p1.fere);
	System.out.println(p2.name+"���"+p2.marriageStatus);
	System.out.println(p2.name+"�İ����ǣ�"+p2.fere);
}
}
