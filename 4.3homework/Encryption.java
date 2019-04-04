import java.util.Scanner;
public class Encryption{

public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("请输入要加密的四位整数：");
   int x= sc.nextInt();
   int ge=x%10;
   int shi=x/10%10;
   int bai=x/100%10;
   int qian=x/1000;
   System.out.println("加密后的数据为："+((ge+5)%10*1000+(shi+5)%10*100+(bai+5)%10*10+(qian+5)%10));




}






}