package com.neuedu.study.chapter7.homework3;
//3.2.2 Circle��ʾԲ�࣬����1�����ԣ�radius��ʾ�뾶��
//��дgetPer��getArea��showAll���������������������������췽����Ϊ�뾶����ɫ��ֵ�ģ���
public class Circle extends Shape{
    double radius;
    public Circle() {}
    public Circle(double radius,String color) {
    	this.radius=radius;
    	this.color=color;
    }
    
	@Override
	double getArea() {
		
		return Math.PI*radius*radius;
	}

	@Override
	double getPer() {
		
		return 2*Math.PI*radius;
	}

	@Override
	void showAll() {
		System.out.println("Բ�İ뾶Ϊ��"+this.radius+"��Բ����ɫΪ"+this.color+"��Բ�����Ϊ��"+this.getArea()+"��Բ���ܳ�Ϊ��"+this.getPer());
		
	}

}
