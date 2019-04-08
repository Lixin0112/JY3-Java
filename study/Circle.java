package com.neuedu.study;

import java.awt.Point;

public class Circle {
	
Point p;
int r;

//���庬�ι��췽��
public Circle(Point p0,int r0){
	p=p0;
	r=r0;
}

//����������ķ���area
public static double area(int r) {
	return 3.14*Math.pow(r, 2);
	
}
//�����жϵ��Ƿ���Բ�еķ���
public static boolean contains(Circle c,Point p)
{   
	return (Math.pow(c.r,2)>Math.pow((c.p.x-p.x),2)+Math.pow((c.p.y-p.y),2));
}
//����contains����
public static boolean contains(Circle c,int x,int y) {
	return (Math.pow(c.r,2)>Math.pow((c.p.x-x),2)+Math.pow((c.p.y-y),2));
}
public static void main(String[] args) {
	//��������c0
	Point p0=new Point(5,5);
	int r0=5;
	Circle c0=new Circle(p0,r0);
    System.out.println(area(r0));
    System.out.println(contains(c0,p0));
    System.out.println(contains(c0,p0.x,p0.y));
}
}
