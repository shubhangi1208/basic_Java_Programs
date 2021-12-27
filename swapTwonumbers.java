import java.util.*;
public class swapTwonumbers {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before Swapping X is " + x + " and Y is " + y);
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping X is " + x + " and Y is " + y);
				
		
	}

}
