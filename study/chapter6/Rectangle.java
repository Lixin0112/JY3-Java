package com.neuedu.study.chapter6;
/*
 2、定义一个矩形类Rectangle：（知识点：对象的创建和使用）[必做题]
2.1 定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
2.2 有2个属性：长length、宽width
2.3 通过构造方法Rectangle(int width, int length)，分别给两个属性赋值
2.4 创建一个Rectangle对象,并输出相关信息
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
	System.out.println("这个矩形的长为："+length+",这个矩形的宽为："+width+"，这个矩形的面积为："+this.getArea()+"，这个矩形的周长为："+this.getPer());
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
