import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int num = 100;
       
        for(int i = 0; i < num; i++){
            if(i%2==0) continue;
            if(i==9) break;
            System.out.println("Java is Fun " + i);
        }
        
        /*
        int numA = 5;
        int numB = 5;
        int numPre = ++numA;
        int numPost = numB++;
        System.out.println(numPre);
        System.out.println(numPost);
        System.out.println(numA);
        System.out.println(numB);
        */

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        for(Integer number:numbers){
            System.out.println(number);
        }
    }
}
