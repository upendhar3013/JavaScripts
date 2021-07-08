package bootCampJavaTutorials;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation you want to perform");
		String str = sc.nextLine();
		System.out.println("Enter any first integer value");
		double i = sc.nextDouble();
		System.out.println("Enter any second integer value");
		double j = sc.nextDouble();
		System.out.println("Action performed : "+str);
		if(str.equalsIgnoreCase("add")) {
				double n = i+j;
				System.out.println("result : "+n);
			}else if(str.equalsIgnoreCase("sub")){
				double n = i-j;
				System.out.println("result : "+n);
			}else if(str.equalsIgnoreCase("mul")) {
				double n=i*j;
				System.out.println("result : "+n);
			}else if(str.equalsIgnoreCase("div")) {
				double n = i/j;
				System.out.println("result : "+n);
			}else if(str.equalsIgnoreCase("mod")) {
				double reminder = i%j;
				System.out.println("result : "+reminder);
		}
	}
}
