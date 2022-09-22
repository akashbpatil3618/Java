//Add,sub,mul,div 
public class airthmatic
{
public static void main(String [] args)
{
int x,y;
x = 8;
y =2;
myCode(x,y);
}
private static void myCode(int x,int y)
{
int add = x+y;
System.out.println("Addtion of x & y is : "+add);

int sub = x-y;
System.out.println("Substraction of x & y is : "+sub);

int mul = x*y;
System.out.println("Multiplication of x & y is : "+mul);

int div = x/y;
System.out.println("Division of x & y is : "+div);

}
}