public class PracticeFour{
public static void main(String[] args){
  /*将一个整数（56123）翻转（32165）
  */
     int a=56123;
     int ge=a%10;
     int shi=a/10%10;
     int bai=a/100%10;
	 int qian=a/1000%10;
	 int wan=a/10000;
     int b=ge*10000+shi*1000+bai*100+qian*10+wan;
	 System.out.print(b);
      

  }
 }
