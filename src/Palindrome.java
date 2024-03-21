import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input a text you want to check : ");
        String theText = inputScanner.nextLine();
        inputScanner.close();
        
        /*String[] splittedText = theText.split("");
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
        */
        for(int i=0; i<theText.length(); i++){
            if(theText.charAt(i)==theText.charAt(theText.length()-1-i)){
                if(i != (theText.length()/2)){
                    continue;
                }
                else{
                    System.out.println(theText + " is Palindrome");
                    break;
                }
            }
            else{
                System.out.println(theText + " is not Palindrome");
                break;
            }
            
        }
    }
}
