public class PracticeThree{
public static void main(String[] args){
  //�ַ�����"123456789012" ���ַ���������λ�������Ϊ c1 = 1 + 3 + 5 + 7 + 9 + 1 ���ַ�����ż��λ�������Ϊ c2 = 2 + 4 + 6 + 8 + 0 + 2
   String s="123456789012";
   int c1=0,c2=0;
   for(int i=0;i<s.length();i=i+2){
    c1+=(s.charAt(i)-48);
   }
   System.out.println("����λ�ĺ�Ϊ��"+c1);
   for(int j=1;j<s.length();j=j+2){
    c2+=(s.charAt(j)-48);
   }
   System.out.println("ż��λ�ĺ�Ϊ��"+c2);
  }
 }
