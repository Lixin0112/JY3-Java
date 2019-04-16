package com.neuedu.study.chapter7.homework3;
//3.2.2 Circle表示圆类，增加1个属性，radius表示半径，
//重写getPer、getArea和showAll三个方法，另外又增加两个构造方法（为半径、颜色赋值的）。
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
		System.out.println("圆的半径为："+this.radius+"，圆的颜色为"+this.color+"，圆的面积为："+this.getArea()+"，圆的周长为："+this.getPer());
		
	}

}
