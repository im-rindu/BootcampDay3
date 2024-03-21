import java.util.Scanner;

public class LoopInput {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int num = 1;
        String theText = "y";  
        do {
            System.out.println(num + " (press y to continue)");
            theText = inputScanner.nextLine();  
            if (theText.equals("y")) {
                num++;
            }
        } while (!theText.equals("n"));
        inputScanner.close();
    }
}
