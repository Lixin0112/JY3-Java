import java.util.Scanner;
public class Encryption{

public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("������Ҫ���ܵ���λ������");
   int x= sc.nextInt();
   int ge=x%10;
   int shi=x/10%10;
   int bai=x/100%10;
   int qian=x/1000;
   System.out.println("���ܺ������Ϊ��"+((ge+5)%10*1000+(shi+5)%10*100+(bai+5)%10*10+(qian+5)%10));




}






}