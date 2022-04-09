import java.util.Scanner;
public class Largest{
public static void main(String[] args){
double x,y,z;
Scanner reader= new Scanner(System.in);
System.out.print("Enter value of x : ");
x=reader.nextDouble();
System.out.print("Enter value of y : ");
y=reader.nextDouble();
System.out.print("Enter value of z : ");
z=reader.nextDouble();
if(x>y&&x>z){
    System.out.println("x is largest.");
}
else if(y>x&&y>z){
    System.out.println("y is largest.");
}
else{
    System.out.println("z is greatest.");
}

}
}