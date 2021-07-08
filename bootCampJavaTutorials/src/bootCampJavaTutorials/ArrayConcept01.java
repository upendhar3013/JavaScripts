package bootCampJavaTutorials;

public class ArrayConcept01 {

	public static void main(String[] args) {
		String[] str = new String[10];
		
//		Adding values in an Array
		for (int i=0; i<str.length; i++) {
			str[i]="String No :"+i;
		}
		
//		print an array
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
//		using for each loop 
		System.out.println("using for each loop");
		for(String s: str) {
			System.out.println(s);
		}

	}

}
