//输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E（知识点：条件语句if elseif） [必做题]


import java.util.Scanner;
public class HomeWork9{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("请输入一个分数：");
  int x=sc.nextInt();
  if(x<0|x>100){
  System.out.println("你输入的分数无效");
  }else if(x>=90){
    System.out.println("你输入的分数为A级");
  }else if(x>=80){
    System.out.println("你输入的分数为B级");
  }else if(x>=70){
    System.out.println("你输入的分数为C级");
  }else if(x>=60){
    System.out.println("你输入的分数为D级");
  }else{
    System.out.println("你输入的分数为E级");
  }
  }
}
