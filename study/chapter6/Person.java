package com.neuedu.study.chapter6;
/*
 * 5�����������࣬�������£� [������]
5.1����һ������Person��
5.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
5.1.2���������ԣ����֡���ߡ�����
 */
public class Person {
String name;
double height;
int age;
public Person(String name,double height,int age) {
	this.name=name;
	this.height=height;
	this.age=age;
}
public void sayHello() {
	System.out.println("hello��my name is "+this.name);
}
}
