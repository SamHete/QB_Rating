package qbRating;

import static java.lang.System.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Allows for user input
		Scanner input = new Scanner(System.in);

		// Prompts user for all values needed and assigns them a variable name
		System.out.println("What is the number of passing attempts?");
		double ATT = input.nextDouble();
		System.out.println("What is the number of passing yards?");
		double YDS = input.nextDouble();
		System.out.println("What is the number of completions?");
		double COMP = input.nextDouble();
		System.out.println("What is the number of touchdown passes?");
		double TD = input.nextDouble();
		System.out.println("What is the number of interceptions?");
		double INTR = input.nextDouble();
		
		//computes QB Rating from assigned values
		Double a = (((COMP/ATT)-.30)*5);
		Double b = (((YDS/ATT)-3)*.25);
		Double c = (double) ((TD/ATT)*20);
		Double d = (2.375-((INTR/ATT)*25));
		Double QB = (((a+b+c+d)*.1666666)*1000);
		
		//rounds QB Rating to one decimal place
		double QB2 = Math.round((QB * 10) / 10.0);
		double QBFinal = QB2/10;
		//prints QB Rating to console
		System.out.println("The player's passer rating is " + QBFinal);
	}
}
