package bootCampJavaTutorials;
import java.util.Scanner;

public class CheckGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Subject : ");
		String str = sc.nextLine();
		System.out.println("Enter Marks in "+str);
		int i = Integer.parseInt(sc.nextLine());
		
		if(i<35)
			System.out.println("Fail");
		else if(i>=40 && i<=50)
			System.out.println("Grade : D");
		else if(i>50 && i<=60)
			System.out.println("Grade : C");
		else if(i>60 && i<=70)
			System.out.println("Grade : B");
		else if(i>70 && i<=80)
			System.out.println("Grade : A");
		else if(i>80 && i<=95)
			System.out.println("Grade : A+");
		else if(i>95 && i<=100)
			System.out.println("Congratulations on achieving Grade : O");
		else
			System.out.println("Invalid please enter valid marks in "+str);

	}

}
