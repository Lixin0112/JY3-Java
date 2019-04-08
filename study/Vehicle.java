package com.neuedu.study;
/*
 * 19.请定义一个交通工具(Vehicle)的类其中有:
 *  属性速度(speed)体积(size)等等 方法移动(move())设置速度(setSpeed(int speed))等. 
 *  最后在测试类Vehicle中的main()中实例化一个交通工具对象
 *  并通过方法给它初始化speed,size的值并且通过打印出来。另外调用加速减速的方法对速度进行改变
 */
public class Vehicle {
int speed;
int size;
public Vehicle(int size) {
	this.size=size;
}
public void move() {}
public void setSpeed(int speed) {
	this.speed=speed;
}
public void addSpeed(int add) {
	this.speed+=add;
}
public void reduceSpeed(int reduce) {
	this.speed-=reduce;
}
	public static void main(String[] args) {
		Vehicle v=new Vehicle(3);
        v.setSpeed(30);
        System.out.println("v的体积为："+v.size+",v的速度为："+v.speed);
        v.addSpeed(10);
        System.out.println("加速后v的速度为："+v.speed);
        v.reduceSpeed(20);
        System.out.println("减速后v的速度为："+v.speed);
	}

}
