public class MergeSort 
{
   public int[] mergeSort(int[] unsorted)
    {
	int size;
		
	if(unsorted.length > 1)
	{
            size = unsorted.length / 2;
            int[] left_array = new int[size];
            int[] right_array = new int[unsorted.length - size];
			
            for(int i = 0; i < size; i++)
		left_array[i] = unsorted[i];
			
            for(int i = size; i < unsorted.length; i++)
		right_array[i - size] = unsorted[i];
				
            left_array = mergeSort(left_array);
            right_array = mergeSort(right_array);
			
            return merge(left_array, right_array);
	}
	return unsorted;
    }
	
    public int[] merge(int[] a, int[] b)
    {
	int l = a.length + b.length;
	int[] c = new int[l];
	int index_a = 0, index_b = 0, index_c = 0;
		
	while(index_a < a.length && index_b < b.length)
	{
            if(a[index_a] < b[index_b])
            {
		c[index_c] = a[index_a];
		index_a += 1;
            }else
            {
		c[index_c] = b[index_b];
		index_b += 1;
            }
			
            index_c += 1;
	}
		
	while(index_a < a.length)
	{
            c[index_c] = a[index_a];
            index_a += 1;
            index_c += 1;
	}
		
        while(index_b < b.length)
	{
            c[index_c] = b[index_b];
            index_b += 1;
            index_c += 1;
	}
		
	return c;
    }
 
}
