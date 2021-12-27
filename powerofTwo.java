import java.util.*;
public class powerofTwo {

	public static void main(String[] args) {
		int poweroftwo=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for power of two ");
		int n = sc.nextInt();
	

		for (int i=1; i<=n; i++ )
		{
			poweroftwo=(2*poweroftwo);
			
		}
		System.out.println("Power of two till " + n +" is " +poweroftwo);
	}
	
}
