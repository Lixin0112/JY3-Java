package com.neuedu.study.chapter7.homework4;

//��main�����������ɸ������͵�Ա������һ��ColaEmployee �����
//����Ԫ��������ÿ��Ա�����µĹ��ʡ�
public class TestCompany {

	public static void main(String[] args) {
		Company c = new Company();
		ColaEmployee[] a = new ColaEmployee[3];
		a[0] = new SalariedEmployee("�ܺ�", 1, 8000);
		a[1] = new HourlyEmployee("����", 4, 50, 170);
		a[2] = new SalesEmployee("����",7, 1000000, 0.006);
		for (ColaEmployee p : a) {
			c.show(p, 4);
		}
	}

}
