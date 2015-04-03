package javaLessons;

import java.util.Scanner;

public class BreakLesson {


    public static void run(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("All about BREAK statements!");
        System.out.print("Type anything to continue: ");
        String cont = userInput.next();

        System.out.println("This is the basic form of an BREAK statement:");
        System.out.println("	for (control variable ; condition ; modification){");
        System.out.println("		if(condition){");
        System.out.println("			BREAK;");
        System.out.println("		}");
        System.out.println("	}");
        System.out.print("Type anything to continue: ");
        cont = userInput.next();

        System.out.println("So lets fill in the blanks: ");
        System.out.println("	for (sample = 0; ; sample++){");
        System.out.println("		System.out.println(sample);");
        System.out.println("		if(sample == 14){");
        System.out.println("			break;");
        System.out.println("		}");
        System.out.println("	}");
        System.out.print("Type anything to continue: ");
        cont = userInput.next();

        System.out.println("Now you lets run the program and see what happens: ");

        int sample;
        
        for(sample = 0; ; sample++){
        	
        	System.out.println(sample);
        	
        	if (sample == 14){
        		
        		break;
        		
        	}
        	
        }
        
        System.out.println("Extra stuff:");
        System.out.println("~ you can label a bloack of code and label ypur break to jump out of a specific block");
        System.out.println("~ if the break isn't labeled, it will break out of the first block it is in");
    }

}
