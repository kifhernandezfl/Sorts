public class InsertionSort 
{
    public void insertionSort(int[] unsorted)
    {
	int temp, indexHole;
		
	for(int i = 1; i < unsorted.length; i++)
	{
            temp = unsorted[i];
            indexHole = i;
			
            while(indexHole > 0 && unsorted[indexHole - 1] > temp)
            {
		unsorted[indexHole] = 	unsorted[indexHole - 1];
		indexHole -= 1;	
            }
            unsorted[indexHole] = temp;
	}
    }
}
