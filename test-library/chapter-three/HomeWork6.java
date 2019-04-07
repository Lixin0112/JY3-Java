//6、编写程序， 判断一个变量x的值，如果是1，输出x=1，如果是5，输出x=5，如果是 10，输出x=10，
//除了以上几个值，都输出x=none。（知识点：条件语句） [必做题]

import java.util.Scanner;
public class HomeWork6{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("请输入一个数字：");
  int x=sc.nextInt();
  switch(x){
  case 1:
  System.out.println("x=1");
  break;
   case 5:
  System.out.println("x=5");
   break;
   case 10:
  System.out.println("x=10");
   break;
  default:
  System.out.println("x=none");
  }
}
}