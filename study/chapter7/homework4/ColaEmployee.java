package com.neuedu.study.chapter7.homework4;

//��������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�
//������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ���˾����⽱��100 Ԫ��
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
