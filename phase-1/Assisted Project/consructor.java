class rectangle
{
int breadth;
int length;
rectangle()
{
System.out.print("Default consructor");
}
rectangle(int l,int b)
{
length=l;
breadth=b;
}
void display()
{
System.out.println("length"+length+",breadth="+breadth);
}
}
class test1
{
public static void main(String[] args)
{
rectangle r1=new rectangle(10,20);
r1.display();
}
}
