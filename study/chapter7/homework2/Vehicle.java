package com.neuedu.study.chapter7.homework2;
/*
2.1.1 ���԰���������Ʒ��brand��String���ͣ�����ɫcolor��String���ͣ����ٶ�speed��double���ͣ���
2.1.2 �����ṩһ���вεĹ��췽����Ҫ��Ʒ�ƺ���ɫ���Գ�ʼ��Ϊ����ֵ�����ٶȵĳ�ʼֵ����Ϊ0)
2.1.3 Ϊ�����ṩ������������ע�⣺����Ʒ��һ����ʼ��֮�����޸�.
2.1.4 ����һ��һ�㷽��run()���ô�ӡ��������������ܵĹ���
2.1.5 ��main�����д���һ��Ʒ��Ϊ��benz������ɫΪ��black����������*/
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
	System.out.println("��籼�������Ƿ���");
}
public static void main(String[] args) {
	Vehicle car=new Vehicle("Benz","black");
	car.run();
}
}
