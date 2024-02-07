import java.util.Scanner;
class var_arg{

	static void dis_arr(int[][]...arr){

		for (int[][]matrix: arr) {
			for (int[] row:matrix) {
				for (int value:row) {

				System.out.print(" "+value+" ");
				
				}
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
	
		int arr[][]=new int[2][2];
		int arr2[][]=new int[1][3];

		System.out.println("Enter Array 1:");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Array 2:");
		for (int i=0;i<1;i++) {
			for (int j=0;j<3;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}

		dis_arr(arr);
		dis_arr(arr2);

	}	
}