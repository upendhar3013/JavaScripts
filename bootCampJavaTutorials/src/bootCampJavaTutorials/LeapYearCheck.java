package bootCampJavaTutorials;
import java.util.Scanner;

// Checking with different years 10 times in single run

public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=10;i++) {
			System.out.println("Enter any year in the format YYYY");
			int n = Integer.parseInt(sc.nextLine());
			if((n%4==0)&&(n%100!=0)||(n%400==0)) {
				System.out.println("Year : "+n+" is a leap year");
			}else {
				System.out.println("Year : "+n+" is not a leap year");
			}
			System.out.println("--------------------------------");
		}
	}

}
