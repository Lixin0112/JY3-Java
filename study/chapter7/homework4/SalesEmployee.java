package com.neuedu.study.chapter7.homework4;
//ColaEmployee �����࣬������Ա�������������۶������ʾ�����
//���ԣ������۶�����
public class SalesEmployee extends ColaEmployee{
	int monthlymoney;
	double rate;
	SalesEmployee(String name, int birthmonth,int monthlymoney,
	double rate){
		super(name,birthmonth);
		this.monthlymoney=monthlymoney;
		this.rate=rate;
	}
	public int getSalary(int month) {
		int temp=0;
		if (birthmonth == month) {
			temp += 100;
		}
		temp+=monthlymoney*rate;
		return temp;
	}
}
