import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
			System.out.print("Enter an Integer: "); 
			int num = s.nextInt();
				if (num % 2 == 1) System.out.print("Weird"); // Determine if the inputted Integer is odd.
				else if (num % 2 == 0 || num >= 2 || num <= 5) System.out.print("Not Weird"); // Determine if the inputted Integer is even and greater than 1 and less than 6.
				else if (num % 2 == 0 || num >= 6 || num <= 20) System.out.print("Weird"); // Determine if the inputted Integer is even and greater than 5 and less than 21.
				else if (num % 2 == 0 || num > 20) System.out.print("Not Weird"); // Determine if the the inputted Integer is even and greater than 20.
	}
}