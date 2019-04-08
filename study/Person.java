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
	if(this.sex=='男'&&p.sex=='女'&&this.age>=22&&p.age>=20&&this.marriageStatus=='否'&&p.marriageStatus=='否'){
		this.marriageStatus='是';
		this.fere=p.name;
		p.marriageStatus='是';
		p.fere=this.name;
		return true;
	}else if(this.sex=='女'&&p.sex=='男'&&this.age>=20&&p.age>=22&&this.marriageStatus=='否'&&p.marriageStatus=='否'){
		this.marriageStatus='是';
		this.fere=p.name;
		p.marriageStatus='是';
		p.fere=this.name;
		return true;
	}else {return false;}
	
}

public static void main(String[] args) {
	Person p1=new Person();
	p1.sex='男';
	p1.name="周浩";
	p1.marriageStatus='否';
	p1.age=22;
	Person p2=new Person();
	p2.sex='女';
	p2.name="鞠婧祎";
	p2.marriageStatus='否';
	p2.age=20;
	System.out.println(p1.name+"和"+p2.name+"结婚了么？"+p1.marriage(p2));
	System.out.println(p1.name+"婚否？"+p1.marriageStatus);
	System.out.println(p1.name+"的伴侣是？"+p1.fere);
	System.out.println(p2.name+"婚否？"+p2.marriageStatus);
	System.out.println(p2.name+"的伴侣是？"+p2.fere);
}
}
