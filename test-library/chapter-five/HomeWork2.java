//2����дһ���������жϸ������ƽ�껹�����ꡣ[������]

import java.util.Arrays;
import java.util.Scanner;
public class HomeWork2{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("������һ��Ҫ��ѯ����ݣ�");
int y=sc.nextInt();
System.out.println(bissextile(y));
}
public static boolean bissextile(int y){
   if(y%4==0){
   return true;
   }else{
   return false;
   }


} 

}