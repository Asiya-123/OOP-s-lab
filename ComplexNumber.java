import java.util.*;
import java.io.*;
class ComplexNumber
{
int real,image;
public ComplexNumber(int r,int i)
{
this.real=r;
this.image=i;
}
public void showC()
{
System.out.println(this.real+"+i"+this.image);
}
public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
{
ComplexNumber res=new ComplexNumber(0,0);
res.real=n1.real+n2.real;
res.image=n1.image+n2.image;
return res;
}
public static void main(String arg[])
{
ComplexNumber c1=new ComplexNumber(4,5);
ComplexNumber c2=new ComplexNumber(10,5);
System.out.print("First Complex number:");
c1.showC();
System.out.print("Second Complex number:");
c2.showC();
ComplexNumber res=add(c1,c2);
System.out.println("Addition is:");
res.showC();
}
}

OUTPUT
------
First Complex number:4+i5
Second Complex number:10+i5
Addition is:
14+i10