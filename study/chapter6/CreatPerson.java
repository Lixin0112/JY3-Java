package com.neuedu.study.chapter6;
/*
 * 5�����������࣬�������£� [������]
5.2����һ��PersonCreate�ࣺ
5.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
5.2.2�ֱ���ö����sayHello()������
 */
public class CreatPerson {

public static void main(String[] args) {
	Person p1=new Person("����",1.73,33);
	Person p2=new Person("����",1.74,44);
p1.sayHello();
p2.sayHello();
}
}
