import java.io.*;

public class PrintArray 
{
    public void printArray(int[] array) throws IOException
    {
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	for(int i=0; i<array.length;i++)
            bw.write(array[i] + " ");
		
	bw.write("\n");
	bw.write("\n");
	bw.flush();
    }
}
