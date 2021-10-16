package valid_sudoku;

import java.util.HashSet;

public class valid_sudoko {
	
	 public static boolean isValidSudoku(char[][] board) {
		 
		HashSet<String> map=new HashSet<String>();
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				char number=board[i][j];
				
				if(number !='.')
				{
					if(map.contains(number+"_R_"+i) || map.contains(number+"_C_"+j) || map.contains(number+"_B_"+i/3+'_'+j/3))
					{
						return false;
					}
					else
					{
						map.add(number+"_R_"+i);
						map.add(number+"_C_"+j);
						map.add(number+"_B_"+i/3+"_"+j/3);
					}
				}
			}
		}
		return true;
	        
	    }

}
