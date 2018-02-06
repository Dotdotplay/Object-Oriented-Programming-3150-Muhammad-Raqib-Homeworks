package homeworkQuestions;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); // makes scanner
		while (input.hasNext()) { // keeps checking for values in file 
			int number = input.nextInt(); // makes number equal to the next integer 
			System.out.println(number); // prints the number out 
		}
		
		input.close(); // closes the scanner 
	}

}
