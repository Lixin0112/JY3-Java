public class PrintEverything{
  
  public static void main(String[] arg){
 //��ӡһ��������

      //��һ������
       for(int x=1;x<12;x++){
          System.out.print("* ");
       }
	   	  System.out.println();
       //�ڶ�~��ʮ������
       for(int x=1;x<10;x++){
          System.out.print("* ");
       for(int y=1;y<10;y++){
          System.out.print("  ");
       }
          System.out.print("*");
		  System.out.println();
       }
       //��ʮһ������  
        for(int x=1;x<12;x++){
          System.out.print("* ");
       }
	   	  System.out.println();

 //��ӡ�žų˷���

	   for(int row=1;row<10;row++){
	       for(int col=1;col<=row;col++){
		   System.out.print(col+"*"+row+"="+row*col+"\t");
		  }
		  System.out.println();
	   }

//��ӡָ��ͼ��
        //�ݶ�
        for(int row=1;row<6;row++){
		for(int a=1;a<6-row;a++){System.out.print(" ");}
		for(int b=1;b<6;b++){System.out.print("*");}
		for(int c=1;c<=2*row-2;c++){System.out.print(" ");}
		System.out.println("*");
		}
        //ǽ��
		 //��һ������
       for(int x=1;x<15;x++){
          System.out.print("*");
       }
	   	  System.out.println();
       //�ڶ�~������
       for(int x=2;x<5;x++){
          System.out.print("*");
       for(int y=1;y<13;y++){
          System.out.print(" ");
       }
          System.out.print("*");
		  System.out.println();
       }
       //����������  
        for(int x=1;x<15;x++){
          System.out.print("*");
       }


  }
}