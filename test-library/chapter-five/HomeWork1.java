
//1、编写一个方法，求整数n的阶乘，例如5的阶乘是1x2x3x45。 [必做题]

import java.util.Arrays;
public class HomeWork1{
public static void main(String []args){
int a=5;
System.out.println(factorial(a));
}
public static int factorial(int n){
  int fac=1;
  for(int i=1;i<=n;i++){
   fac*=i;
  }
  return fac;


}


}