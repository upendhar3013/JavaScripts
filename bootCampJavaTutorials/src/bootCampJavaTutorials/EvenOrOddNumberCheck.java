package bootCampJavaTutorials;
import java.util.Scanner;


public class EvenOrOddNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check even or odd");
		int n = Integer.parseInt(sc.nextLine());
		
		if(n%2==0)
			System.out.println("Number "+n+" is an Even Number");
		else
			System.out.println("Number "+n+" is an Odd Number");
		

	}

}
