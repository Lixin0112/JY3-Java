


/*
��ϰ��
��java������䡰int a = 97;����Ч�����������_____ 
int a = 0X0061;
int a = 0X61;    ��
int a = 0141;    ��
int a = 97.0;
��ϰ��
��Щ�ǺϷ����ַ����ͣ�
��AB��
��b��    ��
��123��
��\t��
��\u123f��
��ϰ��
int x = 2;
int y = 1;
boolean z = (x!=2 && y==y++);
System.out.println(z);          false
System.out.println("y="+y);      y=1
��ϰ��
�� x = 1,y = 2,z = 3,����ʽ? y����z����/����x? ��ֵ��()      3
�� x = 2,����ʽ x + +��3 ��ֵ��____                          0
��x = 5,y = 10,��x < y��x >= y���߼�ֵ�ֱ�Ϊ____��_____        true false
�κ���ҵ
1����֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���.(֪ʶ�㣺������������ۺ�Ӧ��) [������]
2������һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����֪ʶ�㣺������������ۺ�Ӧ�ã� [������]
*/

import java.util.Scanner;
public class PartOne{
public static void main(String[] args){
int a=1;
int b=2;
int temp=0;
temp=a;
a=b;
b=temp;
System.out.println("a="+a+",b="+b);


Scanner sc=new Scanner(System.in);
System.out.println("������һ����λ����");
int c=sc.nextInt();
int ge=c%10;
int shi=c/10%10;
int bai=c/100%10;
int qian=c/1000;
int sum=ge+shi+bai+qian;
System.out.println("��λ���ĺ�Ϊ��"+sum);
}

}