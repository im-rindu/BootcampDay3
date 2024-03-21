import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter Some Text: ");
        String theText = inputScanner.nextLine();
        inputScanner.close();
        String[] splittedText = theText.split("");
        String reversedText = "";
        for (int i = splittedText.length-1 ; i >= 0; i--) {
            reversedText += splittedText[i];
        }
        System.out.println("This is a reversed text: "+reversedText);
    }
}
