package metric;
import scanIt.*;

public class metric {
    public static void fC() {
        System.out.println("Please enter the temperature in Fahrenheit: ");
        int n = scanIt.scanInt();

        int sum = ((n-32)* 5/9);
        System.out.println(n+" F --> "+sum+" C");
    }

    public static void cF() {
        System.out.println("Please enter the temperature in Celsius: ");
        int n = scanIt.scanInt();

        int sum = (n*9/5)+32;
        System.out.println(n+" C --> "+sum+" F");
    }

    public static void fM() {
        System.out.println("Please enter the total feet: ");
        int n = scanIt.scanInt();
        int sum = (int) (n/3.281);
        System.out.println(n+" ft --> "+sum+" m");
    }

    public static void mF() {
        System.out.println("Please enter the total meters: ");
        int n = scanIt.scanInt();
        int sum = (int) (n*3.281);
        System.out.println(n+" m --> "+sum+" ft");
    }

    public static void iCM() {
        System.out.println("Please enter the total inches: ");
        int n = scanIt.scanInt();
        int sum = (int) (n*2.54);
        System.out.println(n+" in --> "+sum+" cm");
    }

    public static void cMI() {
        System.out.println("Please enter the total centimeters: ");
        int n = scanIt.scanInt();
        int sum = (int) (n/2.54);
        System.out.println(n+" cm --> "+sum+" in");
    }

    public static void mKM() {
        System.out.println("Please enter the total miles: ");
        int n = scanIt.scanInt();
        int sum = (int) (n*1.60934);
        System.out.println(n+" miles --> "+sum+" km");
    }

    public static void kMM() {
        System.out.println("Please enter the total kilometers: ");
        int n = scanIt.scanInt();
        int sum = (int) (n/1.60934);
        System.out.println(n+" km --> "+sum+" miles");
    }
}
