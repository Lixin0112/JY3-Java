package com.neuedu.study.chapter7.homework3;
// ���Shape��ʾͼ���࣬���������area���ܳ�����per����ɫ����color��
//���������췽����һ����Ĭ�ϵġ�һ����Ϊ��ɫ��ֵ�ģ���
//����3�����󷽷����ֱ��ǣ�getArea���������getPer�����ܳ���showAll���������Ϣ��
//����һ������ɫ�ķ���getColor
abstract class Shape {
	double area;
	double per;
	String color;
	public Shape() {
		System.out.println("�����޲�Shape��Ĺ��췽��");
	}
	public Shape(String color) {
		this.color=color;
		System.out.println("���Ǻ���Shape��Ĺ��췽��");
	}
	abstract double getArea();
	abstract double getPer();
	abstract void showAll();
	String getColor(){
		return color;
	}
	
}
