package com.neuedu.study.chapter7.homework3;
// 设计Shape表示图形类，有面积属性area、周长属性per，颜色属性color，
//有两个构造方法（一个是默认的、一个是为颜色赋值的），
//还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息，
//还有一个求颜色的方法getColor
abstract class Shape {
	double area;
	double per;
	String color;
	public Shape() {
		System.out.println("这是无参Shape类的构造方法");
	}
	public Shape(String color) {
		this.color=color;
		System.out.println("这是含参Shape类的构造方法");
	}
	abstract double getArea();
	abstract double getPer();
	abstract void showAll();
	String getColor(){
		return color;
	}
	
}
