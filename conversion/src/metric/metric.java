package metric;
import scanIt.*;

public class metric {
    public static void fC() {
        System.out.println("Please enter the temperature in Fahrenheit: ");
        int n = scanIt.scanInt();

        int sum = ((n-32)* 5/9);
        System.out.println(n+"F --> "+sum+"C");
    }
}
