import java.util.*;

public class PracticeOne{

public static void main(String[] args){

 /* int x=48;
  
 System.out.println(toChar(x));
  char a='��';
System.out.println(toInt(a));
8*/
Scanner sc=new Scanner(System.in);
System.out.println("������һ���ַ�����");
String x=sc.next();


System.out.println("������ĵ�һ���ַ�ת��������Ϊ"+toInt(x.charAt(0)));

}
public static char toChar(int y){

    char result=(char)y;
    return result;

}
public static int toInt(char b){


   
     return b;

}



}