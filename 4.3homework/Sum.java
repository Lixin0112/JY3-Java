public class Sum{
public static void main(String[] args){

//������1~100���ۼ�ֵ����Ҫ���������и�λΪ3��������ʹ��forѭ��ʵ�֣�
   int sum=0;
   for(int i=1;i<101;i++){
   if(i%10!=3)
   {
   sum+=i;
   }else{
   System.out.println(i);
   }
  
   
   }
   System.out.print("��Ϊ:"+sum);


}



}