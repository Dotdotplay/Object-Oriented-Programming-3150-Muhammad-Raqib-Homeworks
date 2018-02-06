package homeworkQuestions;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// exit using Eof 
		// calculate the area of the circles using the radius values
		// in a loop read radiuses from a user
		Scanner scan = new Scanner(System.in);	// creates the scnaner 	 
		
		while (scan.hasNextDouble()) { // reads user input until ctrl z
			
			double radius = scan.nextDouble();// reads next double value 
			System.out.println("Area of Circle is: " + Math.PI * Math.pow(radius, 2)); // prints area of Circle 	
			
		}
		
		scan.close(); // closes the scanner 											
	}

}
 