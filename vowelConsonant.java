import java.util.*;
public class vowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Alphabet to check whether it is Vowel or consonant ");
        char ch=sc.next( ).charAt(0);	
        
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else
		System.out.println("Entered character " +ch+ " is Consonant ");		
	}

}
