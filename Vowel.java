import java.util.Scanner;
public class Vowel{
    public static void main(String[] args){
        char n;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter any Alphabet: ");
        n=reader.next().charAt(0);
        if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' || n=='O' || n=='U'){
            System.out.println("This is a vowel.");

        }
        else{
            System.out.println("This is a Consonent.");
        }
    }
}