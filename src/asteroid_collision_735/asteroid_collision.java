package asteroid_collision_735;

import java.util.Stack;

public class asteroid_collision {
	
	public static int[] asteroidCollision(int[] asteroids) 
	{
		if(asteroids.length<=1)
		{
			return asteroids;
		}
		Stack<Integer> st=new Stack<Integer>();
		
		for(int i:asteroids)
		{
			if(i>0)
			{
				st.push(i);
			}
			else
			{
				while(!st.isEmpty() && st.peek() > 0 && Math.abs(st.peek())<Math.abs(i))
				{
					st.pop();
				}
				if(st.isEmpty() || st.peek()<0)
				{
					st.push(i);
				}
				else if(st.peek()==Math.abs(i))
				{
					st.pop();
				}
			}
		}
		int[] arr=new int[st.size()];
		for (int i = arr.length - 1; i >= 0; i--)
            arr[i] = st.pop();
		
		
		return arr; 
    }
	
	public static void main(String args[])
	{
		int[] ast= {5,10,-5};
		for(int i:asteroidCollision(ast))
		{
			System.out.print(i+" ");
		}
	}
	

}
