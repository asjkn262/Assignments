import java.util.Scanner;
public class Oddeven{
public static void main(String[] args){
int n;
Scanner reader = new Scanner(System.in);
System.out.print("Enter any value :");
n=reader.nextInt();
if(n%2==0){
System.out.println("The number is even :");
}
else{
System.out.println("The number is odd :");
}
}
}