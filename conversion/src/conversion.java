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

        else if(n.equals("CF")) {
            System.out.println("Starting Celsius --> Fahrenheit conversion...");
            metric.cF();
            main(null);
        }

        else if(n.equals("FM")) {
            System.out.println("Starting Feet --> Meters conversion...");
            metric.fM();
            main(null);
        }

        else if(n.equals("MF")) {
            System.out.println("Starting Meter --> Feet conversion...");
            metric.mF();
            main(null);
        }

        else
            System.out.println("Quitting program...");
    }

    private static void help() {
        System.out.println("Available commands:\n\"FC\" - Fahrenheit --> Celsius\n\"CF\" Celsius --> Fahrenheit\n\"FM\" Feet --> Meters\n\"MF\" Meters --> Feet");
        main(null);
    }
}
