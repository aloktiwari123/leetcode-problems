package Shifting_letters;

public class shifting_letters {

	public static String shiftingLetters(String s, int[] shifts) 
	{
		char[] S = s.toCharArray();
        int shift = 0;  // Store cumulative sum % 26, because of wrap around
        for(int i = shifts.length-1; i >= 0 ; i--) {
            shift = (shift + shifts[i]) % 26;  // Add current value
            S[i] = (char)('a' + (S[i]-'a'+shift) % 26);  // Update current character
        }
        return new String(S);
		
    }
	
	public static void main(String args[])
	{
		int[] shifts= {10,20,30};
		String str="aaa";
		System.out.println(shiftingLetters(str, shifts));
	}
}
