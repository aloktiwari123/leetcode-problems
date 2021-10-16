package search_2d_matrix;

public class search_2D {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		int n=matrix.length;
		int m=matrix[0].length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(target==matrix[i][j])
				{
					return true;
				}
			}
		}
		return false;
        
    }

	public static void main (String args[])
	{
		int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		
		System.out.print(searchMatrix(matrix, target));
	}
}
