//7���ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6��������
//��ֻ�ܱ�5��������ӡ�ܱ�5��������
//��ֻ�ܱ�6����������ӡ�ܱ�6��������
//���ܱ�5��6����������ӡ���ܱ�5��6��������֪ʶ�㣺������䣩 [������]
import java.util.Scanner;
public class HomeWork7{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("������һ�����֣�");
  int x=sc.nextInt();
  if(x%5==0&&x%6==0){
  System.out.println("�ܱ�5��6ͬʱ����");
  }else if(x%6==0&&x%5!=0){
  System.out.println("�ܱ�6����");
  }else if(x%5==0&&x%6!=0){
  System.out.println("�ܱ�5����");
  }else{
  System.out.println("���ܱ�5��6����");
  }
}
}