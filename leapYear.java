import java.util.*;

public class leapYear {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        Boolean isLeapYear = checkLeapYear(year);
        if(isLeapYear){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }

    static Boolean checkLeapYear(int year){
    	Boolean isLeapYear;
        if(year % 4 == 0){
            if(year % 100 == 0){
                isLeapYear = year % 400 == 0;
            }
            isLeapYear = true;
        }
        else{
            isLeapYear = false;
        }
        return isLeapYear;
	}

}
