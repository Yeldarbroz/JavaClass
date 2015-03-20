package javaLessons;

import java.util.Scanner;

public class LessonsMain {

        public static void run(){

                Scanner userInput = new Scanner(System.in);

                boolean doneLearning = false;

                while(doneLearning == false){

                        System.out.println("What would you like to learn now? (type done to finish learning)");

                        String lesson = userInput.next();

                        switch (lesson){

                        case "if": IfLesson.run();
                        break;

                        case "if statement": IfLesson.run();
                        break;

                        case "if statements": IfLesson.run();
                        break;

                        case "while": WhileLesson.run();
                        break;

                        case "while loop": WhileLesson.run();
                        break;

                        case "while loops": WhileLesson.run();
                        break;

                        case "done": doneLearning = true;
                        break;

                        default : System.out.println("Sorry, I'm not sure what you want to learn. Could you run the program again and try another word?");

                        }

                }

        }

}