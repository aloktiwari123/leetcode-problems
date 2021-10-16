package reshape_matrix;

import java.util.Arrays;

public class reshape {
	
	public static int[][] matrixReshape(int[][] mat, int r, int c)
	{
		
	 int m = mat.length;
	 int n = mat[0].length;
	 int sc=0;
	 int sr=0;
	 
	 if(m*n !=r*c)
	 {
		 return mat;
	 }
	 
	 int[][] newmat=new int[r][c];
	 for(int i=0;i<m;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
			 if(sc==c)
			 {
				 sc=0;
				 sr++;
				 
			 }
			 newmat[sr][sc]=mat[i][j];
			 sc++;
		 }
	 }
	 return newmat;
        
    }
	
	public static void main(String args[])
	{
		int[][] mat = {{1,2},{3,4}};
		int r=1;
		int c=4;
		System.out.print(Arrays.toString(matrixReshape(mat, r, c)));
	}

}
