package bootCampJavaTutorials;

public class MultiDimensionalArrayConcept {

	public static void main(String[] args) {
		int[][] n;
		n=new int[10][20];
		
		for(int i=0; i<n.length;i++) {
			for(int j=0;j<=n[i].length-1;j++) {
				n[i][j]=i+j;
			}
		}
		
		System.out.println("Printing Multidimensional Array");
		for(int i=0; i<n.length;i++) {
			for(int j=0; j<n[i].length;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
