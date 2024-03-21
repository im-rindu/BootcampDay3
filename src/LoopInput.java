import java.util.Scanner;

public class LoopInput {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int num = 1;
        String theText;  
        do {
            System.out.println(num + " (press y to continue)");
            theText = inputScanner.nextLine();  
            num++;
        } while (theText.equals("y"));
        inputScanner.close();
    }
}
