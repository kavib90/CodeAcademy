import java.util.* ;
import java.io.*; 
public class Solution 
{

	public static int numberOfMismatchingBits(int first, int second)
	{
		int count =0;
		  for (int i = 0; i < 32; i++) {
 
        // right shift both the numbers by 'i' and
        // check if the bit at the 0th position is different
        if (((first >> i) & 1) != ((second >> i) & 1)) {
            count++;
        }
    }
		return count;
		
	}

}
