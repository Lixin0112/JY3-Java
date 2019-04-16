package com.neuedu.study.chapter7.homework4;

//这是所有员工总的父类，属性：员工的姓名,员工的生日月份。
//方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100 元。
public class ColaEmployee {
	String name;
	int birthmonth;

	ColaEmployee() {
	}

	ColaEmployee(String name, int birthmonth) {
		this.name = name;
		this.birthmonth = birthmonth;
	}

	public int getSalary(int month) {
		if (birthmonth == month) {
			return 100;
		} else {
			return 0;
		}
	}

}
