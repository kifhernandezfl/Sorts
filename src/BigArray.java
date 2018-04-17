import java.util.*;

public class BigArray 
{
    public int[] bigArray(int length)
    {
	Random rd = new Random();
	int[] temp = new int[length];
		
	for(int i = 0; i < length; i++)
            temp[i] = rd.nextInt(100);
		
	return temp;
    }
}
