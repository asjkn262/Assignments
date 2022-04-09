import java.util.Scanner;
public class Quonrem{
public static void main(String[] args){
int a,b;
Scanner reader = new Scanner(System.in);
System.out.print("Enter the value of dividend :");
a=reader.nextInt();
System.out.print("Enter the value of divisor :");
b=reader.nextInt();
System.out.println("The quotient is:"+(a/b));
System.out.println("The remainder is:"+(a%b));
}
}