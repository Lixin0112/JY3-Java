package com.neuedu.study.chapter7.homework4;

//ColaEmployee 的子类，按小时拿工资的员工，每月工作超出160 小时的部分按照1.5倍工资发放。
//属性：每小时的工资、每月工作的小时数
public class HourlyEmployee extends ColaEmployee {
	HourlyEmployee(String name, int birthmonth, int hourlysalary, int monthlyhours) {
		super(name, birthmonth);
		this.hourlysalary = hourlysalary;
		this.monthlyhours = monthlyhours;
	}

	int hourlysalary;
	int monthlyhours;

	public int getSalary(int month) {
		int temp = 0;
		if (birthmonth == month) {
			temp += 100;
		}
		if (monthlyhours > 160) {
			temp += 160 * hourlysalary + (monthlyhours - 160) * 1.5 * hourlysalary;
		} else {
			temp += monthlyhours * hourlysalary;
		}
		return temp;
	}
}
