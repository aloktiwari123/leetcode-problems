package pascal_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class psacal_tri {
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		List<Integer>row,pred=null;
		for(int i=0;i<numRows;i++)
		{
			row=new ArrayList<Integer>();
			
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i)
				{
					row.add(1);
				}
				else
				{
					row.add(pred.get(j-1)+pred.get(j));
				}
			}
			pred=row;
			res.add(row);
		}
		return res;
        
    }
	
	public static void main(String args[]) {
		int n=5;
		System.out.print(generate(n));
		
	}

}
