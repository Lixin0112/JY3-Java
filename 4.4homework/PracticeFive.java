public class PracticeFive{

  /*
题目：en-13 条码验证计算 验证码条码共 13 位，代表了一件商品编码，前 12 位（692116851128）有具体代表含义，第 13 位是通过如下步骤算出来的：
第 1 步：取出该数的奇数位和，c1 = 6 + 2 + 1 + 8 + 1 + 2 = 20
第 2 步：取出该数的偶数位和，c2 = 9 + 1 + 6 + 5 + 1 + 8 = 30
第 3 步：将"奇数和"不"偶数和的三倍"相加，cc = c1+c2*3 = 20 + 30 * 3 = 110
第 4 步：取结果的个位数（对 10 取余）：110 的个位数为（110%10=0）
第 5 步：用 10 减去这个个位数：10 - 0 = 10
第 6 步：对得到的数再取个位数（对 10 取余）：10%10=0
所以校验码为 0


*/
       public static void main(String[] args){
       String code="692116851128";
       int sumOdd=0;
       for(int i=0;i<12;i=i+2){
       int odd=code.charAt(i)-48;
       sumOdd+=odd;
       }
       int sumEven=0;
       for(int i=1;i<12;i=i+2){
       int even=code.charAt(i)-48;
       sumEven+=even;
       }
       int check=(10-(sumOdd+sumEven*3)%10)%10;
       System.out.println("校验码为："+check);
       
       }     




}