//6����д���� �ж�һ������x��ֵ�������1�����x=1�������5�����x=5������� 10�����x=10��
//�������ϼ���ֵ�������x=none����֪ʶ�㣺������䣩 [������]

import java.util.Scanner;
public class HomeWork6{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("������һ�����֣�");
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