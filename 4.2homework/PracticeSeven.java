import java.util.*;
public class PracticeSeven{
 /*
计算两个点P1(x1,y1)与P2(x2,y2)之间的距离

int i = 1;
boolean b = 3+4>4||5!=6 &&7>8+ ++i
a.语法错误 b.true c 编译错误 d.运行错误 e.false

补充内容： 根据今天所学内容，完成： 用户在控制台输入基本工资数，计算到手工资 
要求： 1.税率（Baidu） 2.保险（Baidu 基本工资的11%） 五险一金 3.输入一个数，得出到手的钱
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
/*System.out.println("请依顺序输入P1点的横坐标x1和纵坐标y1(用回车隔开):");
int x1=sc.nextInt();
int y1=sc.nextInt();
 System.out.println("请依顺序输入P2点的横坐标x2和纵坐标y2(用回车隔开):");
int x2=sc.nextInt();
int y2=sc.nextInt();
 System.out.println("P1和P2的距离为:"+Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
int i=1;
boolean b = 3+4>4||5!=6 &&7>8+ ++i;
System.out.println(b);*/

   System.out.println("请输入您的工资：");
   double salary=sc.nextDouble();
double part=salary-5000;
double ratal=0;
if(part<=0){
ratal=0;
}else if(part<=3000){
ratal=part*0.03;
}else if(part<=12000){
ratal=3000*0.03+(part-3000)*0.1;
}else if(part<=25000){
ratal=3000*0.03+9000*0.1+(part-12000)*0.2;
}else if(part<=30000){
ratal=3000*0.03+9000*0.1+13000*0.2+(part-25000)*0.25;
}else if(part<=55000){
ratal=3000*0.03+9000*0.1+13000*0.2+5000*0.25+(part-30000)*0.3;
}else if(part<=80000){
ratal=3000*0.03+9000*0.1+13000*0.2+5000*0.25+25000*0.3+(part-55000)*0.35;
}else{
ratal=3000*0.03+9000*0.1+13000*0.2+5000*0.25+25000*0.3+25000*0.35+(part-80000)*0.45;
}
double insurance=salary*0.222+3;

double money=salary-ratal-insurance;
System.out.print("您到手的钱为："+money);

    }
}