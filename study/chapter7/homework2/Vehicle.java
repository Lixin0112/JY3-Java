package com.neuedu.study.chapter7.homework2;
/*
2.1.1 属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型）。
2.1.2 至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0)
2.1.3 为属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改.
2.1.4 定义一个一般方法run()，用打印语句描述汽车奔跑的功能
2.1.5 在main方法中创建一个品牌为“benz”、颜色为“black”的汽车。*/
public class Vehicle {
private String brand;
String color;
double speed;
public Vehicle() {}
public Vehicle(String brand,String color) {
	this.setBrand(brand);
	this.color=color;
	this.speed=0;
}
private void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return this.brand;
}
//public void setColor(String color) {
//	this.color=color;
//}
//public String getColor() {
//	return this.color;
//}
//public void setSpeed(double speed) {
//	this.speed=speed;
//}
//public double getSpeed() {
//	return this.speed;
//}
public void run() {
	System.out.println("随风奔跑自由是方向");
}
public static void main(String[] args) {
	Vehicle car=new Vehicle("Benz","black");
	car.run();
}
}
