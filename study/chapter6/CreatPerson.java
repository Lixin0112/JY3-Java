package com.neuedu.study.chapter6;
/*
 * 5、定义两个类，描述如下： [必做题]
5.2定义一个PersonCreate类：
5.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
5.2.2分别调用对象的sayHello()方法。
 */
public class CreatPerson {

public static void main(String[] args) {
	Person p1=new Person("张三",1.73,33);
	Person p2=new Person("李四",1.74,44);
p1.sayHello();
p2.sayHello();
}
}
