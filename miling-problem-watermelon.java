import java.util.*;
class Main{
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	System.out.print("Enter kilo/s: ");
	int kilos = s.nextInt();
	if (kilos >=1 && kilos <= 100){ //Range of 1 to 100.
		double result = kilos/2.0; // Divide the result to half.
		if (result % 2 == 0) // Check if the Integer is even.
			System.out.print(result + " YES");
		else
			System.out.print(result + " NO");
		}
	else	// If the Integer is less than 1 or greater than 100.
		System.out.print("Invalid kilo/s!");
	}
}