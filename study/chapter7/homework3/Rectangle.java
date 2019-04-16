package com.neuedu.study.chapter7.homework3;
//3.2.1 Rectangle表示矩形类，增加两个属性，Width表示长度、height表示宽度，
//重写getPer、getArea和showAll三个方法，
//另外又增加一个构造方法（一个是默认的、一个是为高度、宽度、颜色赋值的）。
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
		System.out.println("矩形的长为："+this.width+"，矩形的宽为："+this.height+"，矩形的颜色为："+this.color+"，矩形的周长为："+this.getPer()+"，矩形的面积为："+this.getArea());
	}

}
