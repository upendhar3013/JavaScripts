package bootCampJavaTutorials;
import java.util.Scanner;



public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = Integer.parseInt(sc.nextLine());
		
		int i=(n%2==0)?25:32;
		System.out.println(i);
	}

}
