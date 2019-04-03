public class Car{
    public static void main(String[] args){
     for(int i=0;i<100;i++){
     int j=i*i;
     int ge=j%10;
     int shi=j/10%10;
     int bai=j/100%10;
     int qian=j/1000;
     if(ge==shi&&bai==qian&&ge!=bai){
     System.out.println(j);
	 System.out.print(i);
   }
  }
 }
}