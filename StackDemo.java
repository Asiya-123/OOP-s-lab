import java.util.*;
public class StackDemo{
public static void main(String args[])
{
Stack<Integer> stack = new Stack<Integer>();
stack.add(10);
stack.add(20);
stack.add(30);
stack.add(40);
stack.add(50);
System.out.println("Stack:"+stack);
int rem_ele=stack.remove(0);
System.out.println("Removed element:"+ rem_ele);
System.out.println("Final Stack:"+stack);
}
}
