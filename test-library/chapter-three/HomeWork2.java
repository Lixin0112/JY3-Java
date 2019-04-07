

//2、给定一个成绩a，使用switch结构求出a的等级。A：90-100，B：80-89，C：70-79，D：60-69，E：0~59（知识点：条件语句switch） [必做题]
import java.util.Scanner;
public class HomeWork2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("请输入您的成绩");
int a=sc.nextInt();
switch(a/10){
case 10:
System.out.println("您的成绩等级为A");
break;
case 9:
System.out.println("您的成绩等级为A");
break;
case 8:
System.out.println("您的成绩等级为B");
break;
case 7:
System.out.println("您的成绩等级为C");
break;
case 6:
System.out.println("您的成绩等级为D");
break;
default:
System.out.println("您的成绩等级为E");

}


}
}