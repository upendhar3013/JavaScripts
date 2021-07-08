package bootCampJavaTutorials;
import java.util.Scanner;

public class OperandsInJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What kind of operand you want to perform");
		String str = sc.nextLine();
		boolean T = true;
		boolean F = false;
		boolean R;
		if(str.equalsIgnoreCase("AND")) {
			System.out.println("T and T : "+(R=T&&T));
			System.out.println("T and F : "+(R=T&&F));
			System.out.println("F and T : "+(R=F&&T));
			System.out.println("F and F : "+(R=F&&F));
		}else if(str.equalsIgnoreCase("OR")) {
			System.out.println("T and T : "+(R=T||T));
			System.out.println("T and F : "+(R=T||F));
			System.out.println("F and T : "+(R=F||T));
			System.out.println("F and F : "+(R=F||F));
		}
	}
}
