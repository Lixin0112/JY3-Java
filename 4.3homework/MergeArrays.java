import java.util.Arrays;
public class MergeArrays{
/*现在给出两个数组: 数组A：{1,7,9,11,13,15,17,19} 数组B：{2,4,6,8,10} 两个数组合并为数组c,按升序排列*/

public static void main(String[] args){

int[] A={1,7,9,11,13,15,17,19} ;
int[] B={2,4,6,8,10};
int[] c=Arrays.copyOf(A,A.length+B.length);
System.arraycopy(B,0,c,A.length,B.length);
System.out.println("排序前数组c为:"+Arrays.toString(c));
   int temp;
   for(int i=0;i<c.length-1;i++){
   for(int j=0;j<c.length-1-i;j++){
   
      if(c[j]>c[j+1]){
      temp=c[j];
      c[j]=c[j+1];
      c[j+1]=temp;   
      }
   }
 }
System.out.println("排序后的数组c为:"+Arrays.toString(c));




}



}