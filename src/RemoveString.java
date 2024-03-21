import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input your text : ");
        String theText = inputScanner.nextLine();
        System.out.print("Input a text you want to remove : ");
        String theTextToDlt = inputScanner.nextLine();
        inputScanner.close();
        
        String theNewText = "";

        for (int i = 0 ; i < theText.length(); i++) {
            boolean flag = false;
            for(int j = 0; j < theTextToDlt.length(); j++){
                if(theText.charAt(i+j)==theTextToDlt.charAt(j)){
                    flag = true;
                    if(j == theTextToDlt.length()-1 ){
                        i += theTextToDlt.length()-1;
                    }
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(!flag)
                theNewText += theText.charAt(i);
        }
        System.out.println("The Result : " + theNewText);    
    }
}
