package javafrombasics;
import java.util.*;
public class mainmethods {
public static  void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a value :");
	String b=sc.next();
	System.out.println("enter \n 10 to integer \n 8 to octal \n 16 to hexa \n 2 to binary:");
	int c=sc.nextInt();
	Integer a=Integer.valueOf(b, c);
	System.out.println(a);
}
}
