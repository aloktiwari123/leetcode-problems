package pascal_triangle;

public class element_at_given_loc {

	public static int find_at_loc(int row, int  column)
	{
		row=row-1;
		column=column-1;
		int res=1;
		for( int i=0;i<column;++i) // fun to find nCr 
		{
		  res *=(row-i);
		  res/=(i+1);
			
		}
		return res;
	}
	
	public static void main(String args[])
	{
		System.out.print(find_at_loc(5,3));
	}

}
