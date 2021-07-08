package bootCampJavaTutorials;



public class ArithematicOperationJava {

	public static void main(String[] args) {
		
		int i=5;
		int k=i++;
		System.out.println("Pre increment "+k);
		
		int j=6;
		int l = j--;
		System.out.println("Pre decrement "+l);
		System.out.println("==============================");
		System.out.println(i);
		System.out.println(j);
		System.out.println("===================");
		while(i<=10) {
			++i;
			System.out.println(i);
		}
		
		System.out.println("===================");
		while(j>=0) {
			--j;
			System.out.println(j);
		}

	}

}
