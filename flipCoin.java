
import java.util.*;
public class flipCoin {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter how many times you want to flip the coin: ");
    int n= scan.nextInt();
    flipCoinFunction(n);
    
}
 static void flipCoinFunction(int n)
 {
    int Heads=0;
    int Tails=0;
    int Headpercentage;
    int Tailspercentage;
    for(int i=0;i<n;i++)
    	if (Math.random() < 0.5){
    		//System.out.println("Heads");
    		Heads+=1;
    		}
    	else{
    		//System.out.println("Tails");
    		Tails+=1;
    		}
    System.out.println("Number of Heads " + Heads);
    System.out.println("Number of Tails " + Tails );
    
    Headpercentage = (Heads / n ) * 100;
    Tailspercentage = (Tails / n) * 100;
    System.out.println("Heads percentage " + Headpercentage + "%");
    System.out.println("Tails percentage " + Tailspercentage + "%");

 }
}