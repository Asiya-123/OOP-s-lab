import java.util.*;
class GFG
{
static void checkSymmetric(int mat[][],int row,int col)
{
int i,j,flag=1;
System.out.println("The matrix formed is:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(mat[i][j]+"\t");
}
System.out.println("");
}
int[][] transpose=new int[row][col];
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
transpose[j][i]=mat[i][j];
}
}
if(row==col)
{
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
if(mat[i][j]!=transpose[i][j])
{
flag=0;
break;
}
}
if(flag==0)
{
System.out.print("/n The matrix is not symmetric.");
break;
}
}
if(flag==1)
{
System.out.print("/n The matrix is symmetric.");
}
}
else
{
System.out.print("/n The matrix is not symmetric.");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,row,col,flag=1;
System.out.print("Enter the number of rows:");
row=sc.nextInt();
System.out.print("Enter the number of columns:");
col=sc.nextInt();
int[][]mat=new int[row][col];
System.out.println("Enter the matrix elements:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat[i][j]=sc.nextInt();
}
}
checkSymmetric(mat,row,col);
}
}

OUTPUT
=====


Enter the number of rows:3
Enter the number of columns:4
Enter the matrix elements:
2 4 6 8
7 5 8 4
3 6 9 7
The matrix formed is:
2       4       6       8
7       5       8       4
3       6       9       7
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at GFG.checkSymmetric(GFG.java:21)
        at GFG.main(GFG.java:69)