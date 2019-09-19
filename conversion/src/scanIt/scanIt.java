package scanIt;
import java.util.Scanner;

public class scanIt {
    public static java.lang.Integer scanInt() {
        Scanner tmp = new Scanner(System.in);
        int n = tmp.nextInt();
        return n;
    }

    public static java.lang.String scanString() {
        Scanner tmp = new Scanner(System.in);
        String n = tmp.nextLine();
        return n;
    }

    public static void main(String[] args) {}
}