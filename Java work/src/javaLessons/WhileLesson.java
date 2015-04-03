package javaLessons;

import java.util.Scanner;

public class WhileLesson {

    public static void run(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("All about WHILE statements!");
        System.out.print("Type anything to continue: ");
        String cont = userInput.next();

        System.out.println("This is the basic form of an WHILE statement:");
        System.out.println("    WHILE (boolean condition){");
        System.out.println("            Statement");
        System.out.println("            control");
        System.out.println("    }");
        System.out.print("Type anything to continue: ");
        cont = userInput.next();

        System.out.println("So lets fill in the blanks: ");
        System.out.println("    WHILE (sample == true){");
        System.out.println("            System.out.println(\"You decided sample should be true!\")");
        System.out.println("            sample = false");
        System.out.println("    }");
        System.out.println("    System.out.println(\"sample is now:\" + sample)");
        System.out.print("Type anything to continue: ");
        cont = userInput.next();

        System.out.print("Now you decide if sample should be true (one) or false (two): ");

        int sample = userInput.nextInt();

        if (sample == 1){

            System.out.println("You decided sample should be true!");
            System.out.println("sample is now: false");

        }
        if (sample == 2){

            System.out.println("sample is now: false");

        }

        System.out.println("Extra stuff:");
        System.out.println("~ you can use a do while loop where the code is run first, then the condition is checked");
        
    }

}
