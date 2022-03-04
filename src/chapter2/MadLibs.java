package chapter2;

import java.io.StringReader;
import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]){

        //1. An adjective
        System.out.println("Declare an adjective");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        //2. The season of the year
        System.out.println("What season of the year?");
        String season = scanner.next();

        //3. The whole number
        System.out.println("Frequency");
        int wholeNumber = scanner.nextInt();
        scanner.close();

        //4. Display result
        System.out.println("On a" + " " + adjective + " " + season + " " + "day," + " " + "I drink a minimum of" + " " + wholeNumber + " " + "cups of coffee.");
    }
}
