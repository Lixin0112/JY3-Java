package com.neuedu.study.chapter7.homework2;

/*
2.2.1 轿车有自己的属性载人数loader（int 类型）。
2.2.2 提供该类初始化属性的构造方法.
2.2.3 重新定义run()，用打印语句描述轿车奔跑的功能。
2.2.4 在main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。

*/
public class Car extends Vehicle{
	int loader;
	public Car() {}
	public Car(String brand,String color,int loader) {
		super(brand,color);
		this.loader=loader;	
	}
	public void run() {
		System.out.println("随风奔跑自由是方向"+this.getBrand()+this.color+this.loader+this.speed);
	}
	
	public static void main(String[] args) {
		
Car car=new Car("Honda","red",2);
car.run();

	}

}
