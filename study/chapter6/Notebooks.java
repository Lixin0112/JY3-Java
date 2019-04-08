package com.neuedu.study.chapter6;
/*
3、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 [必做题]
3.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值;
3.2 输出笔记本信息的方法
3.3 然后编写一个测试类，测试笔记本类的各个方法.
 */
public class Notebooks {
char color;
int  version;
public Notebooks() {}
public Notebooks(char color,int version) {
	this.color=color;
	this.version=version;
}
public void show() {
	System.out.println("笔记本的颜色为："+this.color+",笔记本的型号为："+this.version);
}
//	public static void main(String[] args) {
//	
//
//	}

}
