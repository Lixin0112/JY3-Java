package com.neuedu.study;

public class Book {
	String name;
	int pages;
	double price;
	String author;
	String ISBN;
	String type;
	String publisher;
	public void read(){
		System.out.print("���ڱ���������");
	}
	public void collect(){
		System.out.print("�Ѿ����ղ�  ");
	}
	public double sell(double price,int count) {
		double money=price*count;
		return money;
	}
}
