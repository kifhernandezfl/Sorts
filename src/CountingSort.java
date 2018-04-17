public class CountingSort 
{
    public void countingSort(int[] unsorted)
    {
	int max = Integer.MIN_VALUE;
	int[] aux;
	int index = 0;
		
	for(int i = 0;i < unsorted.length;i++)
            if(unsorted[i] > max)
            max = unsorted[i];

	aux = new int[max + 1];
		
	for(int i = 0;i < unsorted.length;i++)
            aux[unsorted[i]] += 1;
			
	for(int i = 0;i < aux.length;i++)
            for(int j = 0; j < aux[i]; j++)
		{
                    unsorted[index] = i;
                    index += 1;
		}
    }
}
