package com.neuedu.study.chapter7.homework4;

//ColaEmployee �����࣬�ù̶����ʵ�Ա�������ԣ���н
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
