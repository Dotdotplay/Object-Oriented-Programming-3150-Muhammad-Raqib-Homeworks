package homeworkQuestions;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		double Center1X,Center1Y,Center2X,Center2Y,radius1,radius2;
		boolean circleCharacteristics;
		Scanner input = new Scanner (System.in);
		// Enter Values
		System.out.println("Enter Center Coordinates for Circle1");
		Center1X=input.nextDouble();
		Center1Y=input.nextDouble();
		
		System.out.println("Enter Center Coordinates for Circle12");
		Center2X=input.nextDouble();
		Center2Y=input.nextDouble();
		
		System.out.println("Enter Radius of Circle1");
		radius1=input.nextDouble();
		
		System.out.println("Enter Radius of Circle2");
		radius2=input.nextDouble();
		
		circleCharacteristics = AreTheCirclesDisjoint( Center1X,Center1Y,Center2X, Center2Y, radius1, radius2);
			if (circleCharacteristics==true) {
			
				System.out.println("The Two Circles are Disjointed");
		
			} else {
			
				System.out.println("The Two Circles are not Disjointed");
			
		}
		circleCharacteristics = AretheCirclesWithinOneAnother(Center1X,Center1Y,Center2X, Center2Y, radius1, radius2);
			if (circleCharacteristics==true) {
			
				System.out.println("The Two Circles are within each other");
			
			} else {
				
				System.out.println("The Two Circles are not within each other");
				
			}
		
		circleCharacteristics = DotheCirclesIntersect(Center1X,Center1Y,Center2X, Center2Y, radius1, radius2);
			if (circleCharacteristics==true) {
			
				System.out.println("The Two Circles intersect");
			
			} else {
				
				System.out.println("The Two Circles do not intersect");
				
			}
		circleCharacteristics = dotheCirclesOverlap(Center1X,Center1Y,Center2X, Center2Y, radius1, radius2);
			if (circleCharacteristics==true) {
			
			System.out.println("The Two Overlap");
		
			} else {
			
				System.out.println("The Two Circles do not Overlap");
			
			}
			input.close();
	}
	
	public static boolean AreTheCirclesDisjoint (double Center1X, double Center1Y, double Center2X, double Center2Y, double radius1, double radius2) {
		boolean Disjoint;
		//compares the distances between the 2 centers with the maximum diameter of the two circles too see if the connect 
		if((Math.pow((Center1X-Center2X), 2) + Math.pow((Center1Y-Center2Y), 2)) < Math.pow(radius1+radius2, 2)) {
			
			Disjoint = false;
			
		} else {
			
			Disjoint = true;
			
		}
		
		return Disjoint;
	}
	// compares the the center values to the radius values to see if the circles are within on another
	public static boolean AretheCirclesWithinOneAnother (double Center1X, double Center1Y, double Center2X, double Center2Y, double radius1, double radius2) {
		boolean within;
		
		if (Math.pow(radius1-radius2, 2) >= Math.pow(Center1X-Center2X, 2)+Math.pow(Center1Y-Center2Y, 2)) {
			
			within=true;
			
		} else {
			
			within=false;
			
		}
		
		return within;
	}
	// checks for intersection
	public static boolean DotheCirclesIntersect (double Center1X, double Center1Y, double Center2X, double Center2Y, double radius1, double radius2) {
		boolean intersect;
		
		if (Math.abs(radius1-radius2) <= Math.sqrt(Math.pow((Center1X-Center2X), 2) + Math.pow((Center1Y-Center2Y), 2)) && Math.sqrt(Math.pow((Center1X-Center2X), 2) + Math.pow((Center1Y-Center2Y), 2)) <= (radius1+radius2)) {
			
			intersect=true;
			
		} else {
			
			intersect=false;
			
		}
		
		return intersect;
		
	}
	// checks to see if all the values are the same meaning that the circle overlaps
	public static boolean dotheCirclesOverlap (double Center1X, double Center1Y, double Center2X, double Center2Y, double radius1, double radius2) {
		
		boolean overlap;
		
		if (Center1X==Center2X && Center1Y==Center2Y && radius1==radius2) {
			
			overlap=true;
			
		} else {
			
			overlap = false;
			
		}
		
		return overlap;
	}
}
