//2、编写一个方法，判断该年份是平年还是闰年。[必做题]

import java.util.Arrays;
import java.util.Scanner;
public class HomeWork2{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("请输入一个要查询的年份：");
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