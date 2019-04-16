package com.neuedu.study.chapter7.homework4;
//定义一个类Company，在该类中写一个方法，调用该方法可以打印出某月某个员工的工资数额
public class Company {
	public void show(ColaEmployee person,int month) {
		System.out.println(person.getSalary(month));
	}
}
