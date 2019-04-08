package com.neuedu.study.chapter4;
import java.util.Arrays;
//7、将一个数组中的元素逆序存放(知识点：数组遍历、数组元素访问)[选作题]
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
