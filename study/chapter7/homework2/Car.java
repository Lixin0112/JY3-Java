package com.neuedu.study.chapter7.homework2;

/*
2.2.1 �γ����Լ�������������loader��int ���ͣ���
2.2.2 �ṩ�����ʼ�����ԵĹ��췽��.
2.2.3 ���¶���run()���ô�ӡ��������γ����ܵĹ��ܡ�
2.2.4 ��main�����д���һ��Ʒ��Ϊ��Honda������ɫΪ��red����������Ϊ2�˵Ľγ���

*/
public class Car extends Vehicle{
	int loader;
	public Car() {}
	public Car(String brand,String color,int loader) {
		super(brand,color);
		this.loader=loader;	
	}
	public void run() {
		System.out.println("��籼�������Ƿ���"+this.getBrand()+this.color+this.loader+this.speed);
	}
	
	public static void main(String[] args) {
		
Car car=new Car("Honda","red",2);
car.run();

	}

}
