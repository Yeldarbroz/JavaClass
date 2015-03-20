package main;

import java.util.*;
import javaLessons.LessonsMain;

public class Main {

        public static void main(String args[]){

                Scanner userInput = new Scanner(System.in);

                String luanchApplication = userInput.next();

                switch(luanchApplication){

                case "lessons": LessonsMain.run();
                break;
                /*
                case "": ;
                break;

                case "": ;
                break;

                case "": ;
                break;

                case "": ;
                break;
                */
                }

        }

}
