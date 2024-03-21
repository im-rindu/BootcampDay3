import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a text you want to check : ");
        String theText = inputScanner.nextLine();
        inputScanner.close();
        String[] splittedText = theText.split("");
        String reversedText = "";
        for (int i = splittedText.length-1 ; i >= 0; i--) {
            reversedText += splittedText[i];
        }
        if (reversedText.equals(theText)) {
            System.out.println(theText + " is Palindrome");
        }
        else{
            System.out.println(theText + " is not Palindrome");
        }
    }
}
