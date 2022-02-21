package max_area_of_island;

public class maxAreaOfIsland {
	 public static int maxAreaOfIsland(int[][] grid) 
	 {
	        int max = 0;
	        int ans = 0;
	        for(int i = 0; i < grid.length; ++i)
	        {
	            for(int j = 0; j < grid[0].length; ++j)
	            {
	                if(grid[i][j] == 1){
	                    ans = dfs(grid, i, j);
	                }
	                max = Math.max(max, ans);
	            }
	        }
	        return max;
	 }
	    
	static int dfs(int[][] grid, int r, int c)
	{
	        
	        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1) return 0;
	        
	        //Marking Visited
	        grid[r][c] = 2;
	        
	        return (1 + dfs(grid, r+1, c)+
	                    dfs(grid, r-1, c)+
	                    dfs(grid, r, c-1)+
	                    dfs(grid, r, c+1));
    }

} 
