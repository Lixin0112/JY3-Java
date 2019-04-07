
//输入三个整数x,y,z，请把这三个数由小到大输出（知识点：条件语句） [必做题]

import java.util.Scanner;
public class HomeWork10{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);  
  System.out.println("请输入第一个整数：");
  int x=sc.nextInt();
 System.out.println("请输入第二个整数：");
  int y=sc.nextInt();
System.out.println("请输入第三个整数：");
  int z=sc.nextInt();
  if(x==y||x==z||y==z){
  System.out.println("请不要输入相同数字");
  }else if(x>y&&x>z){
	   if(y>z){
	    System.out.println(x+" "+y+" "+z);
	  }else{
	    System.out.println(x+" "+z+" "+y);
	  }
  }else if(y>x&&y>z){
	if(x>z){
	    System.out.println(y+" "+x+" "+z);
	  }else{
	    System.out.println(y+" "+z+" "+x);
	  }
  }else{
       if(y>x){
	    System.out.println(z+" "+y+" "+x);
	  }else{
	    System.out.println(z+" "+x+" "+y);
	  }
  
  }

  }
}
