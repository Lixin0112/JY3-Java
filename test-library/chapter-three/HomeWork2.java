

//2������һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���A��90-100��B��80-89��C��70-79��D��60-69��E��0~59��֪ʶ�㣺�������switch�� [������]
import java.util.Scanner;
public class HomeWork2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("���������ĳɼ�");
int a=sc.nextInt();
switch(a/10){
case 10:
System.out.println("���ĳɼ��ȼ�ΪA");
break;
case 9:
System.out.println("���ĳɼ��ȼ�ΪA");
break;
case 8:
System.out.println("���ĳɼ��ȼ�ΪB");
break;
case 7:
System.out.println("���ĳɼ��ȼ�ΪC");
break;
case 6:
System.out.println("���ĳɼ��ȼ�ΪD");
break;
default:
System.out.println("���ĳɼ��ȼ�ΪE");

}


}
}