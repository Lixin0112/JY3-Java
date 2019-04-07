/*
编写一个程序，
计算邮局汇款的汇费。如果汇款金额小于100元，汇费为一元，
如果金额在100元与5000元之间，按1%收取汇费，
如果金额大于5000元，汇费为50元。
汇款金额由命令行输入.(知识点：条件语句)[选做题]
*/
import java.util.Scanner;
public class HomeWork12{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("请输入汇款金额:");
  int x=sc.nextInt();
  if(x<=0){
  System.out.println("请输入正确金额！");
  }else if(x<100){
  System.out.println("汇费为一元");
  }else if(x<=5000){
  System.out.println("汇费为:"+x*0.01);
  }else{
  System.out.println("汇费为50元");
  }


  }
}