import java.util.Scanner;
public class Test1{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("请输入存款年份：");
Double year=sc.nextDouble();
if(year<0){
System.out.println("你输出入的年份有误");
}else if(year<1){
System.out.println("实际利率为："+7.7*0.5+"%");
}else if(year<3){
System.out.println("实际利率为："+7.7*0.7+"%");
}else if(year<5){
System.out.println("实际利率为："+7.7+"%");
}else {
System.out.println("实际利率为："+7.7*1.1+"%");
}




}

}