
//������������x,y,z���������������С���������֪ʶ�㣺������䣩 [������]

import java.util.Scanner;
public class HomeWork10{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("�������һ��������");
  int x=sc.nextInt();
 System.out.println("������ڶ���������");
  int y=sc.nextInt();
System.out.println("�����������������");
  int z=sc.nextInt();
  if(x==y||x==z||y==z){
  System.out.println("�벻Ҫ������ͬ����");
  }else if(x>y&&x>z){
	   if(y>z){
	    System.out.println(x+" "+y+" "+z);
	  }else{
	    System.out.println(x+" "+z+" "+y);
	  }
  }else if(y>x&&y>z){
	if(x>z){
	    System.out.println(y+" "+x+" "+z);
	  }else{
	    System.out.println(y+" "+z+" "+x);
	  }
  }else{
       if(y>x){
	    System.out.println(z+" "+y+" "+x);
	  }else{
	    System.out.println(z+" "+x+" "+y);
	  }
  
  }

  }
}
