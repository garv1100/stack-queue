import java.util.*;  
public class stack_push 
{  
public static void main(String[] args)   
{  
Stack<Integer> stk= new Stack<>();  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
}  
}  
