package com.neuedu.study.chapter6;
/*
 * 1������һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬
 * 2��������Point()��Point(intx0,y0),
   * �Լ�һ��movePoint��int dx,int dy)����ʵ�ֵ��λ���ƶ���
   * ��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ[������] 
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
