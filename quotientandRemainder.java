import java.util.*;
public class quotientandRemainder {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter dividend and Divisor ");
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		
		int quotient = dividend / divisor;
        int remainder = dividend % divisor;
  
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);
		
		
		
	}

}
