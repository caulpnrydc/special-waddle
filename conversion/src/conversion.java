import metric.*;
import scanIt.*;

class conversion {
    public static void main(String[] args){
        System.out.println("Starting conversion app\nType \"help\" if you need the available conversions\n");
        String n = scanIt.scanString();

        if(n.equals("help")) {
            help();
        }

        else if(n.equals("FC")) {
            System.out.println("Starting Fahrenheit --> Celsius conversion...");
            metric.fC();
            main(null);
        }

        else
            System.out.println("Quitting program...");
    }

    private static void help() {
        System.out.println("Available commands:\n\"FC\" - Fahrenheit --> Celsius");
        main(null);
    }
}