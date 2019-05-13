import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanReader = new Scanner(System.in);
//        ####  Exercise 1:
//        Print Hello World in the console
//        System.out.println("Hello World");
//
//        #### Exercise 2:
//        Ask the user for any input. Print that user input.
//        System.out.println("Enter a bird");
//        String bird=scanReader.next();
//        System.out.println(bird);
//
//        ####  Exercise 3:
//        Ask the user for their name. Print Hello [THEIR NAME]
//        System.out.println("Enter your name");
//        String bird=scanReader.nextLine();
//        System.out.println("Hello "+bird);

//        ####  Exercise 9:
//        Ask the user for two numbers. Print "increasing" if the numbers are increasing, and "decreasing" if they are decreasing". If it's not doing either, write "Neither".
//        System.out.println("Enter two numbers");
//        int number1 = scanReader.nextInt();
//        int number2 = scanReader.nextInt();
//        if(number1>number2)
//            System.out.println("Decreasing");
//        else if (number1 < number2) {
//            System.out.println("Increasing");
//        }
//        else{
//            System.out.println("Neither");
//        }

//
//        ####  Exercise 10:
//        Ask the user for three numbers. If they're equal print "All Equal", if they're all different print "All Different", if there's a mix of numbers print "A little bit of everything".
        System.out.println("Enter three numbers");
        int number1 = scanReader.nextInt();
        int number2 = scanReader.nextInt();
        int number3 = scanReader.nextInt();
        if (number1 == number2 && number2 == number3 && number3 == number1){
            System.out.println("All equal");
        }
        else if(number1 != number2 && number2 != number3 && number3 != number1){
            System.out.println("All different");
        }
        else{
            System.out.println("A little bit of everything");
        }

    }
}
