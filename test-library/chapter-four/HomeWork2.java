//2、将一个字符数组的值（neusofteducation）拷贝到另一个字符数组中.(知识点：数组复制)[必做题]

import java.util.Arrays;
public class HomeWork2{
public static void main(String []args){

char a[]={'爱','拼','才','会','赢'};
char b[]=Arrays.copyOf(a,5);
System.out.println(Arrays.toString(b));

}



}