package homeworkQuestions;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
	// prompt user for three 2d points 
	// Caclulate the length of each of the sides using the distance formula 
	// Determine if its a real triangle 
		Scanner input = new Scanner (System.in);
		double point1x, point1y,point2x,point2y,point3x,point3y; 
		double side1,side2,side3;
		boolean RealTriangle;
			// Enter Coordinates
			System.out.println("Enter coordinates for point 1");
			point1x=input.nextDouble();
			point1y=input.nextDouble();
			
			System.out.println("Enter coordinates for point 2");
			point2x=input.nextDouble();
			point2y=input.nextDouble();
			
			System.out.println("Enter coordinates for point 3");
			point3x=input.nextDouble();
			point3y=input.nextDouble();
			//Get side lengths
			side1 = returnsideLength(point1x, point1y, point2x, point2y);
			side2 = returnsideLength(point1x, point1y, point3x, point3y);
			side3 = returnsideLength(point2x, point2y, point3x, point3y);
			
			System.out.println(side1 + " " + side2 + " " + side3);
			
			RealTriangle = RealTriangleCheck(side1,side2,side3);
			//check if its a real Triangle 
			if (RealTriangle==true) {
				
				System.out.println("This triangle is a Real Triangle");
				
			} else {
				
				System.out.println("This triangle is not a Real Triangle");
				
			}
			
			input.close();
		}
		
		
	// calculates distance of the sides 
	public static double returnsideLength (double pointx, double pointy, double pointx2, double pointy2) {
		double length;
		length = Math.sqrt(Math.pow((pointx2-pointx), 2) + Math.pow((pointy2-pointy), 2));
		
		
		return length;
	}
	//calculates if it is a real triangle or not 
	public static boolean RealTriangleCheck (double side1, double side2,double side3) {
		boolean check = false;
		
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			
			check = true;
			
		} else {
			
			check = false;
		}
		
		return check;
	}
}

