//7、判断一个数字是否能被5和6同时整除（打印能被5和6整除），
//或只能被5整除（打印能被5整除），
//或只能被6整除，（打印能被6整除），
//不能被5或6整除，（打印不能被5或6整除）（知识点：条件语句） [必做题]
import java.util.Scanner;
public class HomeWork7{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("请输入一个数字：");
  int x=sc.nextInt();
  if(x%5==0&&x%6==0){
  System.out.println("能被5和6同时整除");
  }else if(x%6==0&&x%5!=0){
  System.out.println("能被6整除");
  }else if(x%5==0&&x%6!=0){
  System.out.println("能被5整除");
  }else{
  System.out.println("不能被5或6整除");
  }
}
}