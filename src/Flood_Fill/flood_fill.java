package Flood_Fill;

public class flood_fill 
{
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] == newColor) return image;
        int source = image[sr][sc];
        dfs(image, sr, sc, newColor, source);
        return image;
    }
    
    static void  dfs(int[][]image, int r, int c, int newColor, int source)
    {
        
        if( r <0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] !=source)return;
        
        image[r][c] = newColor;
        
        dfs(image, r+1,	c, 	newColor, source);
        dfs(image, r-1,	c, 	newColor, source);
        dfs(image, r,  	c+1,newColor, source);
        dfs(image, r,  	c-1,newColor, source);
    } 
   
    public static void main(String args[])
    {
    	int[][] image={{0,0,0},{0,0,0}};
    	int sr = 0;
    	int sc = 0;
    	int newColor = 2;
    	floodFill(image, sr, sc, newColor);
    	for(int i=0;i<image.length;i++)
    	{
    		for(int j=0;j<image[0].length;j++)
    		{
    			System.out.print(image[i][j] +"  ");
    		}System.out.println("");
    	}
    }
    

}
