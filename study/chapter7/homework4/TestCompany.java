package com.neuedu.study.chapter7.homework4;

//在main方法，把若干各种类型的员工放在一个ColaEmployee 数组里，
//并单元出数组中每个员工当月的工资。
public class TestCompany {

	public static void main(String[] args) {
		Company c = new Company();
		ColaEmployee[] a = new ColaEmployee[3];
		a[0] = new SalariedEmployee("周浩", 1, 8000);
		a[1] = new HourlyEmployee("陈特", 4, 50, 170);
		a[2] = new SalesEmployee("安磊",7, 1000000, 0.006);
		for (ColaEmployee p : a) {
			c.show(p, 4);
		}
	}

}
