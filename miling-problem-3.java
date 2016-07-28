import java.util.*;
class Main{
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	String[] arr = new String[5];
	int count = 0;
	for (int ctr = 0; ctr < 5; ctr++){
		System.out.print(ctr+" Enter word: ");
		arr[ctr] = s.next();
		}
	
	for (int ctr =0; ctr<5; ctr++){
		System.out.println(arr[ctr]);		
		}
	System.out.print("Enter left: ");
	int left = s.nextInt();
	System.out.print("Enter right: ");
	int right = s.nextInt();
	System.out.print("Enter String: ");
	String string = s.next();
	for (int i = left - 1; i<right; i++){
		if (string.equals(arr[i]))
			count++;
		}
	System.out.print(left+" "+right+" "+string+" = "+count);
		
	}
}