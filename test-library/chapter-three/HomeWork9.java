//����һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч�����ݷ����ȼ���ӡA,B,C,D,E��֪ʶ�㣺�������if elseif�� [������]


import java.util.Scanner;
public class HomeWork9{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("������һ��������");
  int x=sc.nextInt();
  if(x<0|x>100){
  System.out.println("������ķ�����Ч");
  }else if(x>=90){
    System.out.println("������ķ���ΪA��");
  }else if(x>=80){
    System.out.println("������ķ���ΪB��");
  }else if(x>=70){
    System.out.println("������ķ���ΪC��");
  }else if(x>=60){
    System.out.println("������ķ���ΪD��");
  }else{
    System.out.println("������ķ���ΪE��");
  }
  }
}