package com.neuedu.study.chapter7.homework1;

public class Players {
static int sum=0;
private Players() {
	System.out.println("������һ������");
} 
public static Players create() {
	if(sum<11) {
		sum++;
		return new Players();
	    
	}else {
		System.out.println("�Բ����Ѿ�������11�����󣬲����ٴ���������");
		return null;
	}
}


}
