import java.util.Arrays;
public class HolidayHomeWork14{

public static void main(String[]args){
/*
1.计算10的阶乘

8.一个数如果恰好等于它的因子之和,这个数就成为"完数".例如6=1+2+3.编程:找出1000以内的所有完数

9.一个小球从100高度自由落下,每次落地后反跳回原高度的一半,再落下，求它在第十次落地时,共经过多少米?第10次反弹多高?

11.题目：打印出杨辉三角形（要求打印出10行)

12.一百元钱买百鸡,公鸡每只五元，母鸡每只三元； 小鸡因小价钱低，三只小鸡是一元,公鸡母鸡和小鸡，请你算出有几种购买方法?

13.古典问题:有一对兔子,从出生后第三个月起每个月都生一对兔子,小兔子长到第三个月后每个月又生一对兔子,假如兔子都不死,问每个月的兔子总数为多少?

14.实现冒泡排序与选择排序

15.有n个人围成一圈,顺序排号,从第一个人开始报数(从1到3报数),凡报道3的人退出圈子,问最后留下的是原来第几号的那位
*/
int[] a={8,6,9,5,4,7,0,2,1,3};
//冒泡排序
for(int i=0;i<a.length-1;i++){
    int temp1=0;
    for(int j=0;j<a.length-1-i;j++){
    if(a[j]>a[j+1]){
    temp1=a[j];
    a[j]=a[j+1];
    a[j+1]=temp1; 
    }
    }
}
System.out.println(Arrays.toString(a));
//选择排序
int[] b={8,6,9,5,4,7,0,2,1,3};
for(int x=0;x<b.length-1;x++){
    int temp2=0;
    for(int y=x+1;y<b.length;y++){
    if(b[x]>b[y]){
    temp2=b[x];
    b[x]=b[y];
   b[y]=temp2;
    }
    }
}
System.out.println(Arrays.toString(b));

}
}