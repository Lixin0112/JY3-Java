import java.util.*;
public class PracticeSeven{
 /*
����������P1(x1,y1)��P2(x2,y2)֮��ľ���

int i = 1;
boolean b = 3+4>4||5!=6 &&7>8+ ++i
a.�﷨���� b.true c ������� d.���д��� e.false

�������ݣ� ���ݽ�����ѧ���ݣ���ɣ� �û��ڿ���̨������������������㵽�ֹ��� 
Ҫ�� 1.˰�ʣ�Baidu�� 2.���գ�Baidu �������ʵ�11%�� ����һ�� 3.����һ�������ó����ֵ�Ǯ
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
/*System.out.println("����˳������P1��ĺ�����x1��������y1(�ûس�����):");
int x1=sc.nextInt();
int y1=sc.nextInt();
 System.out.println("����˳������P2��ĺ�����x2��������y2(�ûس�����):");
int x2=sc.nextInt();
int y2=sc.nextInt();
 System.out.println("P1��P2�ľ���Ϊ:"+Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
int i=1;
boolean b = 3+4>4||5!=6 &&7>8+ ++i;
System.out.println(b);*/

   System.out.println("���������Ĺ��ʣ�");
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
System.out.print("�����ֵ�ǮΪ��"+money);

    }
}