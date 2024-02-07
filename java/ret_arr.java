import java.util.Scanner;
class ret_arr{

	static int [][]get_arr(){

		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}

		return a;

	}

	public static void main(String[] args) {
	
		int arr[][]=new int[3][3];

		arr=get_arr();	

			for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}






}