//3、假设某员工今年的年薪是30000元，年薪的年增长率6%。
//编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。（知识点：循环语句for）[选做题]

public class HomeWork3{
public static void main(String[] args){

int x=30000;
int sum=30000;
for(int y=1;y<=10;y++){
   x*=1.06;
   sum+=x;
}
System.out.println("10年后的年薪为:"+x+",10年后总收入为:"+sum);

}
}