package isRobotBounded;

public class isRobotBounded {
	
	private enum Direction
	{
		North,
		South,
		West,
		East
	}
	
	public static boolean is_RobotBounded(String s)
	{
		int x=0;
		int y=0;
		
		Direction direction=Direction.North;
		
		for(char instruct:s.toCharArray())
		{
			if(instruct=='G')
			{
				switch (direction) {
				case North:
					y++;
					break;
				case South:
					y--;
					break;
				case West:
					x--;
					break;
				case East:
					x++;
					break;
				}
			}
			else if(instruct=='L')
			{
				switch (direction) 
				{
				case North:
					direction=Direction.West;
					break;
				case South:
					direction=Direction.East;
					break;
				case West:
					direction=Direction.South;
					break;
				case East:
					direction=Direction.North;
					break;
				}
			}
			else if(instruct=='R')
			{
				switch (direction) 
				{
				case North:
					direction=Direction.East;
					break;
				case South:
					direction=Direction.West;
					break;
				case West:
					direction=Direction.North;
					break;
				case East:
					direction=Direction.South;
					break;
				}
			}
		}
		
		if(x==0 && y==0) return true;
		
		if(direction==Direction.North)return false;
		
		return true;
		
	}
	
	public static void main(String args[])
	{
		String s="GGLL";
		System.out.print(is_RobotBounded(s));
		
	}

}
