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
		System.out.print("正在被看。。。");
	}
	public void collect(){
		System.out.print("已经被收藏  ");
	}
	public double sell(double price,int count) {
		double money=price*count;
		return money;
	}
}
