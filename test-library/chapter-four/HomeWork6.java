//6�� ��һ����8��������18��25��7��36��13��2��89��63�����������ҳ����������������±ꡣ��֪ʶ�㣺�������������Ԫ�ط��ʣ� [������]


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
System.out.println("��������"+max+"�����±�Ϊ��"+imax);
}



}