import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int candies = 0, left, right, total = 0, result = 0, avg, k = 0;
			System.out.print("Enter how many jars: ");
				int jars = s.nextInt();
			System.out.print("Enter operations: ");
				int op = s.nextInt();
					for(int ctr = 0; ctr < op; ctr++){
						System.out.print("Enter left: ");
						left = s.nextInt();
						System.out.print("Enter right: ");
						right = s.nextInt();
						System.out.print("Enter candies: ");
						candies = s.nextInt();
						result = ((right-left)+1)*k;
						total = total + result;
					}
			avg = total/op;
			System.out.print("Average: "+avg);
		}
}
			
			
			