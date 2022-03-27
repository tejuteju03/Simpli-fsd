import java.util.Scanner;
class mc
{
public static void main(String[] args)
{
double n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a  two values");
double n1=sc.nextDouble();
double n2=sc.nextDouble();
System.out.println("enter a operator(+ ,-, * ,/ ,% ,=)");
char op=sc.next().charAt(0);


switch(op)
{
case '+':
n=n1+n2;
System.out.println(n);
break;
case '-':
n=n1-n2;
System.out.println(n);
break;
case '*':
n=n1*n2;
System.out.println(n);
break;
case '/':
n=n1/n2;
System.out.println(n);
break;
default:
System.out.println("invalid operator");
return;
}
System.out.println(n1+ " "+op +" "+n2+ "=" + n);
}
}







