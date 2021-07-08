package bootCampJavaTutorials;
import java.util.Scanner;

public class InputJava {

	public static void main(String[] args) {
		
		
		System.out.println("Enter any String value");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		System.out.println("Enter any integer value");
		int i = sc.nextInt();
		
		System.out.println("Enter any Boolean value");
		boolean bol = sc.nextBoolean(); 
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(bol);
		
	}

}
