package com.neuedu.study.chapter7.homework1;

public class Players {
static int sum=0;
private Players() {
	System.out.println("创建了一个对象");
} 
public static Players create() {
	if(sum<11) {
		sum++;
		return new Players();
	    
	}else {
		System.out.println("对不起，已经创建了11个对象，不能再创建对象了");
		return null;
	}
}


}
