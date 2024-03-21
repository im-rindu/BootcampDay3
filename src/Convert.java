import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        System.out.print("Enter a number (CM) : ");
        Scanner inputScanner = new Scanner(System.in);
        float theNum = inputScanner.nextFloat();
        inputScanner.close();
        System.out.println(theNum + " CM equal with " + theNum/1000 + " KM");
    }
}