import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        double numb1, numb2 , result;
        char operator;
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter value of numb1 : ");
        numb1=reader.nextDouble();
        System.out.print("Enter value of numb2 : ");
        numb2=reader.nextDouble();
        System.out.print("Enter opertion(+,-,*,/) : ");
        operator=reader.next().charAt(0);
        switch(operator){
            case '+' : result = numb1 + numb2;
            break;
            case '-' : result = numb1 - numb2;
            break;
            case '*' : result = numb1 * numb2;
            break;
            case '/' : result = numb1 / numb2;
            break;
        default : System.out.print("error!");
         return;
        }
     System.out.println(numb1+ " " + operator + " " + numb2 + "= " + result );
    }
}