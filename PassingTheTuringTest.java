import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main (String [] args){

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.print("What's your name? ");

        String name = inputReader.nextLine();

        System.out.println("");
        System.out.println("Hi " + name + " I'm Alice");
        System.out.print("What's your favorite color? ");

        String favouriteColor = inputReader.nextLine();
        System.out.println("");

        System.out.println("Huh " + favouriteColor + "? Mine's Electric Lime.");
        System.out.println("I really like limes. They're my favorite fruit, too.");

        System.out.print("What's YOUR favorite fruit, " + name + "? ");
        String favouriteFruit = inputReader.nextLine();

        System.out.println("");

        System.out.println("Really? " +favouriteFruit +"? That's wild!");
        System.out.print("Speaking of favorites, what's your favorite number? ");

        String favouriteNumber = inputReader.nextLine();
        System.out.println("");

        System.out.println(favouriteNumber + " is a cool number. Mine's -7.");
        int result = Integer.parseInt(favouriteNumber) * 7;
        System.out.println(" Did you know " + favouriteNumber + " * 7 is " + result+ "? That's a cool number too!");

        System.out.println("");
        System.out.println("Well, thanks for talking to me, " + name +"!");

    }
}
