/*
��дһ������
�����ʾֻ��Ļ�ѡ���������С��100Ԫ�����ΪһԪ��
��������100Ԫ��5000Ԫ֮�䣬��1%��ȡ��ѣ�
���������5000Ԫ�����Ϊ50Ԫ��
�����������������.(֪ʶ�㣺�������)[ѡ����]
*/
import java.util.Scanner;
public class HomeWork12{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("����������:");
  int x=sc.nextInt();
  if(x<=0){
  System.out.println("��������ȷ��");
  }else if(x<100){
  System.out.println("���ΪһԪ");
  }else if(x<=5000){
  System.out.println("���Ϊ:"+x*0.01);
  }else{
  System.out.println("���Ϊ50Ԫ");
  }


  }
}