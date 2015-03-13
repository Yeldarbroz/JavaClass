package javaLessons;

import java.util.Scanner;

public class IfLesson {

	public static void run(){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("All about IF statements!");
		System.out.println("Type anything to continue: ");
		String cont = userInput.next();
		
		System.out.println("This is the basic form of an IF statement:");
		System.out.println("	IF (condition){");
		System.out.println("		Statement");
		System.out.println("	}");
		System.out.println("	else if (condition){");
		System.out.println("		Statement");
		System.out.println("	}");
		System.out.print("Type anything to continue: ");
		cont = userInput.next();
		
		System.out.println("So lets fill in the blanks: ");
		System.out.println("	IF (sample = 1){");
		System.out.println("		System.out.println(\"You decided sample should be one!\")");
		System.out.println("	}");
		System.out.println("	else if (sample = 2){");
		System.out.println("		System.out.println(\"You decided sample should be two!\")");
		System.out.println("	}");
		System.out.print("Type anything to continue: ");
		cont = userInput.next();
		
		System.out.print("Now you decide if sample should equal one or two: ");
		
		int sample = userInput.nextInt();
		
		if (sample == 1){
			
			System.out.println("You decided sample should be one!");
			
		}
		if (sample == 2){
			
			System.out.println("You decided sample should be two!");
			
		}
		
	}

}
