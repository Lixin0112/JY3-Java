package com.neuedu.study.chapter6;
/*
 * 5、定义两个类，描述如下： [必做题]
5.1定义一个人类Person：
5.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
5.1.2有三个属性：名字、身高、年龄
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
	System.out.println("hello，my name is "+this.name);
}
}
