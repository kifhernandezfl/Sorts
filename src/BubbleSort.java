public class BubbleSort 
{
    public void bubbleSort(int[] unsorted)
    {
	boolean swap = false;
	int temp;
		
	do
	{
            swap = false;
			
            for(int i=0; i<(unsorted.length - 1); i++)
            {
		if(unsorted[i] > unsorted[i+1])
		{
                    temp = unsorted[i];
                    unsorted[i] = unsorted[i+1];
                    unsorted[i+1] = temp;
                    swap = true;
		}
            }
	}
	while(swap);
    }    
}
