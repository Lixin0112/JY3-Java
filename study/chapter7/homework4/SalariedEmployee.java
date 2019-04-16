package com.neuedu.study.chapter7.homework4;

//ColaEmployee 的子类，拿固定工资的员工。属性：月薪
public class SalariedEmployee extends ColaEmployee {
	int monthlysalary;

	SalariedEmployee(String name, int birthmonth, int monthlysalary) {
		super(name, birthmonth);
		this.monthlysalary = monthlysalary;
	}

	public int getSalary(int month) {
		if (birthmonth == month) {
			return monthlysalary + 100;
		} else {
			return monthlysalary;
		}

	}

}
