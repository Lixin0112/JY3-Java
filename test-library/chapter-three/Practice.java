/*
练习一
编写java程序，完成以下功能： 假设有整型变量x，判断x是否为偶数，若为偶数，则在控制台上打印“输入的数值是偶数”。
无论x是否为偶数，最后都要在控制台上输出x的值
练习二
有两个整型变量x，y，请在控制台上输出x与y中值较大的那个数。
练习三
计算1+2+3+…+100的和（提示利用while语句）
计算从1到100的所有奇数相加（提示利用while语句）
用do while 循环来改写1加到100
练习四
用for循环来改写1加到100
用for循环改写从1到100的所有奇数相加的和
*/
import java.util.Scanner;
public class Practice{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  //practice1
  System.out.println("请输入一个整数：");
  int x=sc.nextInt();
  if(x%2==0){
  System.out.println("输入的数值是偶数");
  }
  System.out.println("输入的数值x为："+x);

  //practice2
  System.out.println("请再输入一个整数：");
  int y=sc.nextInt();
  if(x>y){
   System.out.println("较大的数为："+x);
  }else if(x<y){
   System.out.println("较大的数为："+y);
  }else{
  System.out.println("两个数一样大");
  }

  //practice3
  int i=1;int sum=0;
  while(i<=100){
  sum+=i;
  i++;
  }
  System.out.println("1+2+3+…+100的和为："+sum);

  int j=1;int sumodd=0;
  while(j<=100){
  sumodd+=j;
  j=j+2;
  }
  System.out.println("1到100的奇数相加的和为："+sumodd);

  int k=1;int sumdo=0;
  do{
  sumdo+=k;
  k++;
  }
  while(k<=100);
  System.out.println("1+2+3+…+100的和为："+sumdo);

//practice4
  int sumfor=0;
  for(int m=1;m<=100;m++ ){
  sumfor+=m;
  
  }
  System.out.println("1+2+3+…+100的和为："+sumfor);

  int sumforodd=0;
  for(int n=1;n<=100;n=n+2){
  sumforodd+=n;
  
  }
  System.out.println("1到100的奇数相加的和为："+sumforodd);
  }
}