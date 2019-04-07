
//5、输入一个数字，判断是一个奇数还是偶数(知识点：条件语句)[必做题]
import java.util.Scanner;
public class HomeWork5{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("请输入一个数字：");
  int x=sc.nextInt();
  if(x%2==0){
  System.out.println("你输入的数字偶数");
  }else{
  System.out.println("你输入的数字奇数");
  }
}
}