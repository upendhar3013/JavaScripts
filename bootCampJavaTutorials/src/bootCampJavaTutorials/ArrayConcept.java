package bootCampJavaTutorials;

public class ArrayConcept {

	public static void main(String[] args) {
		
//		String[] newArr = new String[5];
		
		int[] a=new int[5];
		a[0]=21;
		a[1]=13;
		a[2]=75;
		a[3]=51;
		a[4]=46;
		
		System.out.println("Printing an Array");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}
//		Sorting an array in ascending order
		System.out.println();
		for(int j=0; j<a.length;j++) {
			for(int i=j; i<a.length-1;i++) {
				int temp;
				if(a[i]>a[i+1]) {
					temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		
		
//		After sorting an array
		System.out.println("Array after sorting in ascending order");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if(i<a.length-1)
				System.out.print(",");
		}
	}

}
