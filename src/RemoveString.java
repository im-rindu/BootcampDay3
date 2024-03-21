import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input your text : ");
        String theText = inputScanner.nextLine();
        System.out.print("Input a text you want to remove : ");
        String theTextToDlt = inputScanner.nextLine();
        inputScanner.close();
        String[] splittedText = theText.split(theTextToDlt);
        String theNewText = "";
        for (int i = 0 ; i < splittedText.length; i++) {
            theNewText += splittedText[i];
        }
        System.out.println("The result : " + theNewText);
    }
}
