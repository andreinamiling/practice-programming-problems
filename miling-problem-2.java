import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int sign = 1;
		int j = 0;
		double arctan = 0;
			System.out.print("Enter value for x: "); 
				double x = s.nextDouble();
			System.out.print("Enter value for k: "); 
				int k = s.nextInt();
					for(int ctr = 1; ctr<=k; ctr++){
						if (ctr % 2 == 0)
							arctan = arctan + (Math.pow(x,j)/j);
							j = j + 2;
						if (ctr % 2 == 1)
							arctan = arctan - (Math.pow(x,j)/j);								
							j = j + 2;
									}
	System.out.print(arctan);
	}
}
