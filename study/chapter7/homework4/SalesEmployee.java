package com.neuedu.study.chapter7.homework4;
//ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。
//属性：月销售额、提成率
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
