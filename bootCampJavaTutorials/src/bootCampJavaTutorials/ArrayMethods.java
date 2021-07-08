package bootCampJavaTutorials;

public class ArrayMethods {

	public static void main(String[] args) {
		int[] a = new int[10];
		ArrayMethods am = new ArrayMethods();
		am.InsertArray(a, 0, 05);
		am.InsertArray(a, 1, 15);
		am.InsertArray(a, 2, 25);
		am.InsertArray(a, 3, 35);
		am.InsertArray(a, 4, 45);
		am.InsertArray(a, 5, 55);
		am.InsertArray(a, 6, 65);
		am.InsertArray(a, 7, 75);
		am.InsertArray(a, 8, 85);
		am.InsertArray(a, 9, 95);
		
		System.out.println("Printing Array");
		for(int i=0;i<a.length;i++) {
			System.out.println("Value at index : "+i+" -- "+a[i]);
		}
	}
	public void InsertArray(int[] intAr, int indexAt, int Val) {
		for(int i=intAr.length-1; i>indexAt; i--) {
			intAr[i]=intAr[i-1];
		}
		
		intAr[indexAt]=Val;
	}

}
