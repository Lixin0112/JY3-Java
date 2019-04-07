//6、 在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。（知识点：数组遍历、数组元素访问） [必做题]


import java.util.Arrays;
public class HomeWork6{
public static void main(String []args){

int[] a={18,25,7,36,13,2,89,63};
int max=0,imax=0;
for( int i=0;i<a.length;i++){
 
   if(a[i]>max){
   max=a[i];
   imax=i;
   }
   }
System.out.println("最大的数是"+max+"，其下标为："+imax);
}



}