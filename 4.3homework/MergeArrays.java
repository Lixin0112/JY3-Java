import java.util.Arrays;
public class MergeArrays{
/*���ڸ�����������: ����A��{1,7,9,11,13,15,17,19} ����B��{2,4,6,8,10} ��������ϲ�Ϊ����c,����������*/

public static void main(String[] args){

int[] A={1,7,9,11,13,15,17,19} ;
int[] B={2,4,6,8,10};
int[] c=Arrays.copyOf(A,A.length+B.length);
System.arraycopy(B,0,c,A.length,B.length);
System.out.println("����ǰ����cΪ:"+Arrays.toString(c));
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
System.out.println("����������cΪ:"+Arrays.toString(c));




}



}