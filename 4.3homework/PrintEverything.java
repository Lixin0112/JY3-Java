public class PrintEverything{
  
  public static void main(String[] arg){
 //打印一个正方形

      //第一行星星
       for(int x=1;x<12;x++){
          System.out.print("* ");
       }
	   	  System.out.println();
       //第二~第十行星星
       for(int x=1;x<10;x++){
          System.out.print("* ");
       for(int y=1;y<10;y++){
          System.out.print("  ");
       }
          System.out.print("*");
		  System.out.println();
       }
       //第十一行星星  
        for(int x=1;x<12;x++){
          System.out.print("* ");
       }
	   	  System.out.println();

 //打印九九乘法表

	   for(int row=1;row<10;row++){
	       for(int col=1;col<=row;col++){
		   System.out.print(col+"*"+row+"="+row*col+"\t");
		  }
		  System.out.println();
	   }

//打印指定图形
        //屋顶
        for(int row=1;row<6;row++){
		for(int a=1;a<6-row;a++){System.out.print(" ");}
		for(int b=1;b<6;b++){System.out.print("*");}
		for(int c=1;c<=2*row-2;c++){System.out.print(" ");}
		System.out.println("*");
		}
        //墙壁
		 //第一行星星
       for(int x=1;x<15;x++){
          System.out.print("*");
       }
	   	  System.out.println();
       //第二~第四行
       for(int x=2;x<5;x++){
          System.out.print("*");
       for(int y=1;y<13;y++){
          System.out.print(" ");
       }
          System.out.print("*");
		  System.out.println();
       }
       //第五行星星  
        for(int x=1;x<15;x++){
          System.out.print("*");
       }


  }
}