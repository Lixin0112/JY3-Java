/*
��ϰһ
��дjava����������¹��ܣ� ���������ͱ���x���ж�x�Ƿ�Ϊż������Ϊż�������ڿ���̨�ϴ�ӡ���������ֵ��ż������
����x�Ƿ�Ϊż�������Ҫ�ڿ���̨�����x��ֵ
��ϰ��
���������ͱ���x��y�����ڿ���̨�����x��y��ֵ�ϴ���Ǹ�����
��ϰ��
����1+2+3+��+100�ĺͣ���ʾ����while��䣩
�����1��100������������ӣ���ʾ����while��䣩
��do while ѭ������д1�ӵ�100
��ϰ��
��forѭ������д1�ӵ�100
��forѭ����д��1��100������������ӵĺ�
*/
import java.util.Scanner;
public class Practice{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  //practice1
  System.out.println("������һ��������");
  int x=sc.nextInt();
  if(x%2==0){
  System.out.println("�������ֵ��ż��");
  }
  System.out.println("�������ֵxΪ��"+x);

  //practice2
  System.out.println("��������һ��������");
  int y=sc.nextInt();
  if(x>y){
   System.out.println("�ϴ����Ϊ��"+x);
  }else if(x<y){
   System.out.println("�ϴ����Ϊ��"+y);
  }else{
  System.out.println("������һ����");
  }

  //practice3
  int i=1;int sum=0;
  while(i<=100){
  sum+=i;
  i++;
  }
  System.out.println("1+2+3+��+100�ĺ�Ϊ��"+sum);

  int j=1;int sumodd=0;
  while(j<=100){
  sumodd+=j;
  j=j+2;
  }
  System.out.println("1��100��������ӵĺ�Ϊ��"+sumodd);

  int k=1;int sumdo=0;
  do{
  sumdo+=k;
  k++;
  }
  while(k<=100);
  System.out.println("1+2+3+��+100�ĺ�Ϊ��"+sumdo);

//practice4
  int sumfor=0;
  for(int m=1;m<=100;m++ ){
  sumfor+=m;
  
  }
  System.out.println("1+2+3+��+100�ĺ�Ϊ��"+sumfor);

  int sumforodd=0;
  for(int n=1;n<=100;n=n+2){
  sumforodd+=n;
  
  }
  System.out.println("1��100��������ӵĺ�Ϊ��"+sumforodd);
  }
}