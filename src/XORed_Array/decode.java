package XORed_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class decode {

public static int[] decode(int[] encoded, int first) {
	int[] decoded = new int[encoded.length + 1];
    decoded[0] = first;
    for(int i = 0; i < encoded.length; i++){
        decoded[i + 1] = encoded[i] ^ decoded[i];
    }
    return decoded;
}
public static void main(String[] args)
{
	 //int[] arr= {1,2,3,4};
	 int[] arr= {6,2,7,3};
	 System.out.print(Arrays.toString(decode(arr,4)));
}
}
