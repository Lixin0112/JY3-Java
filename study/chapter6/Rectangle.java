package com.neuedu.study.chapter6;
/*
 2������һ��������Rectangle����֪ʶ�㣺����Ĵ�����ʹ�ã�[������]
2.1 ��������������getArea()�������getPer()���ܳ���showAll()�ֱ��ڿ���̨���������������ܳ���
2.2 ��2�����ԣ���length����width
2.3 ͨ�����췽��Rectangle(int width, int length)���ֱ���������Ը�ֵ
2.4 ����һ��Rectangle����,����������Ϣ
 */
public class Rectangle {
int length;
int width;
public int getArea() {
	return this.length*this.width;
}
public int getPer() {
	return (this.length+this.width)*2;
}
public void showAll(){
	System.out.println("������εĳ�Ϊ��"+length+",������εĿ�Ϊ��"+width+"��������ε����Ϊ��"+this.getArea()+"��������ε��ܳ�Ϊ��"+this.getPer());
}
public Rectangle(int length,int width) {
	this.length=length;
	this.width=width;
}
public static void main(String[] args) {
	Rectangle rec=new Rectangle(5,4);
	rec.showAll();
}
}
