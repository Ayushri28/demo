package Assign;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {{1,2,3},{3,4,5},{2,5,6}};
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}