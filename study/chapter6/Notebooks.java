package com.neuedu.study.chapter6;
/*
3������һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ� [������]
3.1 �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ;
3.2 ����ʼǱ���Ϣ�ķ���
3.3 Ȼ���дһ�������࣬���ԱʼǱ���ĸ�������.
 */
public class Notebooks {
char color;
int  version;
public Notebooks() {}
public Notebooks(char color,int version) {
	this.color=color;
	this.version=version;
}
public void show() {
	System.out.println("�ʼǱ�����ɫΪ��"+this.color+",�ʼǱ����ͺ�Ϊ��"+this.version);
}
//	public static void main(String[] args) {
//	
//
//	}

}
