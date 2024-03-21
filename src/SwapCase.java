import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input some text : ");
        String theText = inputScanner.nextLine();
        inputScanner.close();
        String[] splittedText = theText.split("");
        String theNewText = "";
        for (int i = 0 ; i < splittedText.length; i++) {
            if(splittedText[i].equals(splittedText[i].toUpperCase()))
                theNewText += splittedText[i].toLowerCase();
            else
                theNewText += splittedText[i].toUpperCase();
        }
        System.out.println("This is swapped case text : " + theNewText);
    }
}
