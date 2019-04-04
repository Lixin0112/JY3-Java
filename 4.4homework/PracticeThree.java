public class PracticeThree{
public static void main(String[] args){
  //字符串："123456789012" 将字符串的奇数位数字相加为 c1 = 1 + 3 + 5 + 7 + 9 + 1 将字符串的偶数位数字相加为 c2 = 2 + 4 + 6 + 8 + 0 + 2
   String s="123456789012";
   int c1=0,c2=0;
   for(int i=0;i<s.length();i=i+2){
    c1+=(s.charAt(i)-48);
   }
   System.out.println("奇数位的和为："+c1);
   for(int j=1;j<s.length();j=j+2){
    c2+=(s.charAt(j)-48);
   }
   System.out.println("偶数位的和为："+c2);
  }
 }
