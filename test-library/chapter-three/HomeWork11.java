//11����һ��������5λ��������,�����Ǽ�λ��,�ֱ��ӡ��ÿһλ����.(֪ʶ�㣺�������)[������]

import java.util.Scanner;
public class HomeWork11{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("������һ��������5λ����������");
  int x=sc.nextInt();
  int ge=x%10;
  int shi=x/10%10;
  int bai=x/100%10;
  int qian=x/1000%10;
  int wan=x/10000;
  if(x/100000!=0){
  System.out.println("��Ҫ���볬��5λ������");
  }else if(wan==0&&qian==0&&bai==0&&shi==0){
  System.out.println("����һ��һλ��:"+ge);
  }else if(wan==0&&qian==0&&bai==0){
  System.out.println("����һ����λ��:"+shi+" "+ge);
  }else if(wan==0&&qian==0){
  System.out.println("����һ����λ��:"+bai+" "+shi+" "+ge);
  }else if(wan==0){
  System.out.println("����һ����λ��:"+qian+" "+bai+" "+shi+" "+ge);
  }else{
  System.out.println("����һ����λ��:"+wan+" "+qian+" "+bai+" "+shi+" "+ge);
  }
  }
}