import java.util.*;
public class harmonicNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
	    int number = sc.nextInt();
	     
	    System.out.print(nthHarmonic(number));
	}
		
		static double nthHarmonic(int number) {
	    float harmonic = 1;
	 
	    // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
	    for (int i = 2; i <= number; i++) {
	        harmonic += (float)1 / i;
	    }
	 
	    return harmonic;
	}
	
}
	


