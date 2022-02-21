package sequential_digits_1291;
import java.util.*;

public class sequential_digit {

	 public static List<Integer> sequentialDigits(int low, int high) 
	 {
		 String digit="123456789";
		 List<Integer>lst=new ArrayList<Integer>();
		 for(int i=1;i<=9;i++)
		 {
			 for(int j=i;j<digit.length()-i;j++)
			 {
				 String out=digit.substring(j,j+i);
				 int value=Integer.parseInt(out);
				 if(value>=low && value<=high)
				 {
					 lst.add(value);
				 }
			 }
		 }
		return lst;
	        
	    }
}
