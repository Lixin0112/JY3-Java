//输入一个年份，判断这个年份是否是闰年（知识点：条件、循环语句） [必做题]



import java.util.Scanner;
public class HomeWork8{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("请输入一个年份：");
  int x=sc.nextInt();
  if(x%4==0){
  System.out.println("你输入的年份是闰年");
  }else{
    System.out.println("你输入的年份不是闰年");
  }
  }
}
