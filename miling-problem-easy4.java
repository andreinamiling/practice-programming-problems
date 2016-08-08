import java.util.*;
class Main{
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
		int num = 0, r = 0, sum = 0, temp = 0;
		System.out.print("Enter an Integer: ");
		num = s.nextInt();
		temp = num; //Passing the value of num to temp
		while (num!=0){
			r = num % 10; //Get the Integer divisible by 10
			sum = sum + r*r*r; //Cube every digit of the given Integer
			num = num / 10; //Part of splitting the Integer
			}
		if (temp == sum)
			System.out.print(sum+" Armstrong Number ");
		else
			System.out.print(sum+" Not Armstrong Number ");
		
		
	}

}
