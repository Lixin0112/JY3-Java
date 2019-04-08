package com.neuedu.study.chapter6;
/*
 * 1、定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，
 * 2个构造器Point()和Point(intx0,y0),
   * 以及一个movePoint（int dx,int dy)方法实现点的位置移动，
   * 创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。[必作题] 
 */
public class Point {
	int x;
	int y;
	public Point() {}
	public Point(int x0,int y0) {
		x=x0;
		y=y0;
	}
	public void movePoint(int dx,int dy) {
		this.x+=dx;
		this.y+=dy;
	}
	public static void main(String[] args){
		Point p1=new Point(5,5);
		Point p2=new Point(7,7);
		p1.movePoint(1, 2);
		p2.movePoint(2, 1);
		System.out.println("p1.x="+p1.x+",p1.y="+p1.y+";p2.x="+p2.x+",p2.y="+p2.y);
	}
}
