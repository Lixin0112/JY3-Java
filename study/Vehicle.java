package com.neuedu.study;
/*
 * 19.�붨��һ����ͨ����(Vehicle)����������:
 *  �����ٶ�(speed)���(size)�ȵ� �����ƶ�(move())�����ٶ�(setSpeed(int speed))��. 
 *  ����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶���
 *  ��ͨ������������ʼ��speed,size��ֵ����ͨ����ӡ������������ü��ټ��ٵķ������ٶȽ��иı�
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
        System.out.println("v�����Ϊ��"+v.size+",v���ٶ�Ϊ��"+v.speed);
        v.addSpeed(10);
        System.out.println("���ٺ�v���ٶ�Ϊ��"+v.speed);
        v.reduceSpeed(20);
        System.out.println("���ٺ�v���ٶ�Ϊ��"+v.speed);
	}

}
