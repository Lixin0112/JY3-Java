//3������ĳԱ���������н��30000Ԫ����н����������6%��
//��дһ��JavaӦ�ó�������Ա��10������н����ͳ��δ��10�꣨�ӽ������������롣��֪ʶ�㣺ѭ�����for��[ѡ����]

public class HomeWork3{
public static void main(String[] args){

int x=30000;
int sum=30000;
for(int y=1;y<=10;y++){
   x*=1.06;
   sum+=x;
}
System.out.println("10������нΪ:"+x+",10���������Ϊ:"+sum);

}
}