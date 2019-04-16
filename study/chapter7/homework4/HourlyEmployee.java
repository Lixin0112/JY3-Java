package com.neuedu.study.chapter7.homework4;

//ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5�����ʷ��š�
//���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
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
