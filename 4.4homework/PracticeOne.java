import java.util.Scanner;
public class PracticeOne{
public static void main(String[] args){
  
   Scanner sc=new Scanner(System.in);
   System.out.println("������һ�λ�:");
   String str=sc.next();
   System.out.println("������������λ���Ҫ��ѯλ�õĺ���:");
   char ch=(sc.next()).charAt(0);
   System.out.print("���������������ֵ�");
   for(int i=0;i<str.length();i++){
   if(str.charAt(i)==ch){
   System.out.print("��"+(i+1)+" ");
   }
   }
   System.out.print("����");
}
}