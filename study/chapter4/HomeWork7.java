package com.neuedu.study.chapter4;
import java.util.Arrays;
//7����һ�������е�Ԫ��������(֪ʶ�㣺�������������Ԫ�ط���)[ѡ����]
public class HomeWork7 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length-1-i];
		}
		System.out.print(Arrays.toString(b));
	}	
}
