import java.util.*;
public class largestNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter three numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int largest;
		
		largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
		System.out.println("The largest number is: "+largest);  
      
	}

}
