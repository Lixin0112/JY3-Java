import java.util.Arrays;
public class Sort{
public static void main(String[] args){
    int[] a={9,3,5,7,1};
    int[] a1=bubbleSort(a);
    System.out.println(Arrays.toString(a1));
    int[] c={8,4,2,6,0};


}
public static int[] bubbleSort(int[] a){
   int temp;
   for(int i=0;i<a.length-1;i++){
   for(int j=0;j<a.length-1-i;j++){
   if(a[j]>a[j+1]){
   temp=a[j+1];
   a[j+1]=a[j];
   a[j]=temp;
   }
   }
   }
   return a;
}

}