package com.neuedu.study.chapter7.homework3;
//3.2.1 Rectangle��ʾ�����࣬�����������ԣ�Width��ʾ���ȡ�height��ʾ��ȣ�
//��дgetPer��getArea��showAll����������
//����������һ�����췽����һ����Ĭ�ϵġ�һ����Ϊ�߶ȡ���ȡ���ɫ��ֵ�ģ���
public class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(){}
    public Rectangle(double height,double width,String color) {
    	this.height=height;
    	this.width=width;
    	this.color=color;
    }
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

	@Override
	double getPer() {
		// TODO Auto-generated method stub
		return (this.height+this.width)*2;
	}

	@Override
	void showAll() {
		// TODO Auto-generated method stub
		System.out.println("���εĳ�Ϊ��"+this.width+"�����εĿ�Ϊ��"+this.height+"�����ε���ɫΪ��"+this.color+"�����ε��ܳ�Ϊ��"+this.getPer()+"�����ε����Ϊ��"+this.getArea());
	}

}
