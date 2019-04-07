


/*
练习二
在java中与语句“int a = 97;”等效的声明语句是_____ 
int a = 0X0061;
int a = 0X61;    √
int a = 0141;    √
int a = 97.0;
练习三
哪些是合法的字符类型？
‘AB’
‘b’    √
“123”
‘\t’
‘\u123f’
练习四
int x = 2;
int y = 1;
boolean z = (x!=2 && y==y++);
System.out.println(z);          false
System.out.println("y="+y);      y=1
练习五
设 x = 1,y = 2,z = 3,则表达式? y＋＝z－－/＋＋x? 的值是()      3
设 x = 2,则表达式 x + +／3 的值是____                          0
若x = 5,y = 10,则x < y和x >= y的逻辑值分别为____和_____        true false
课后作业
1、已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序.(知识点：变量和运算符综合应用) [必做题]
2、给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除（知识点：变量和运算符综合应用） [必做题]
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
System.out.println("请输入一个四位数：");
int c=sc.nextInt();
int ge=c%10;
int shi=c/10%10;
int bai=c/100%10;
int qian=c/1000;
int sum=ge+shi+bai+qian;
System.out.println("各位数的和为："+sum);
}

}