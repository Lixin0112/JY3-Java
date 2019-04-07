//5、 输出一个double型二维数组（长度分别为5、4，值自己设定）的值。（知识点：数组定义和创建、多维数组初始化、数组遍历） [必做题]



import java.util.Arrays;
public class HomeWork5{
public static void main(String []args){

double[][] a={{1,2,3,4},{11,22,33,44},{15,25,35,45},{12,22,32,42},{12,23,34,45}};
for( int i=0;i<5;i++){
   for(int j=0;j<4;j++){
   System.out.print(a[i][j]+"\t");

   }
   System.out.println();


}

}



}