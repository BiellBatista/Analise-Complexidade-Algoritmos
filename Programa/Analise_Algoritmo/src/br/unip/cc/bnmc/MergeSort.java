package br.unip.cc.bnmc;

import javax.swing.JOptionPane;

public class MergeSort extends Sort
{
	private static long count;
	@SuppressWarnings("unused")
	private long[] theArray;
	
	public static void mergeSortIma()
	{
		Imagem[] workSpace = new Imagem[getnElemsIma()];
		recMergeSortIma(workSpace, 0, getnElemsIma() - 1);
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count - 1), "Merge Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
	
	public static void recMergeSortIma(Imagem[] workSpace, int lowerBound, int upperBound)
	{
		++count;
		
		if(lowerBound == upperBound)
			return ;
		
		else
		{
			int mid = (lowerBound + upperBound) / 2;
			
			recMergeSortIma(workSpace, lowerBound, mid);
			
			recMergeSortIma(workSpace, mid + 1 , upperBound);
			
			mergeIma(workSpace, lowerBound, mid + 1, upperBound);
		}
	}
	
	public static void mergeIma(Imagem[] workSpace, int lowPtr, int highPtr, int upperBound)
	{
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;
		
		while(lowPtr <= mid && highPtr <= upperBound)
		{
			if(getArrayIma(lowPtr).getWidth() < getArrayIma(highPtr).getWidth())
				workSpace[j++] = getArrayIma(lowPtr++);

			else
				workSpace[j++] = getArrayIma(highPtr++);
			
			++count;
		}

		while(lowPtr <= mid)
		{
			workSpace[j++] = getArrayIma(lowPtr++);
			++count;
		}

		while(highPtr <= upperBound)
		{
			workSpace[j++] = getArrayIma(highPtr++);
			++count;
		}

		for(j = 0; j < n; j++)
		{
			setArrayIma(workSpace[j], lowerBound+j);
			++count;
		}
	}
	
	public static void mergeSortInt()
	{
		int[] workSpace = new int[getnElemsInt()];
		recMergeSortInt(workSpace, 0, getnElemsInt() - 1);
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count - 1), "Merge Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}
	
	public static void recMergeSortInt(int[] workSpace, int lowerBound, int upperBound)
	{
		++count;
		
		if(lowerBound == upperBound)
			return ;
		
		else
		{
			int mid = (lowerBound + upperBound) / 2;
			
			recMergeSortInt(workSpace, lowerBound, mid);
			
			recMergeSortInt(workSpace, mid +1 , upperBound);
			
			mergeInt(workSpace, lowerBound, mid + 1, upperBound);
		}
	}
	
	public static void mergeInt(int[] workSpace, int lowPtr, int highPtr, int upperBound)
	{
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr - 1;
		int n = upperBound - lowerBound + 1;
		
		while(lowPtr <= mid && highPtr <= upperBound)
		{
			if(getArrayInt(lowPtr) < getArrayInt(highPtr))
				workSpace[j++] = getArrayInt(lowPtr++);

			else
				workSpace[j++] = getArrayInt(highPtr++);
			
			++count;
		}

		while(lowPtr <= mid)
		{
			workSpace[j++] = getArrayInt(lowPtr++);
			++count;
		}

		while(highPtr <= upperBound)
		{
			workSpace[j++] = getArrayInt(highPtr++);
			++count;
		}

		for(j = 0; j < n; j++)
		{
			setArrayInt(workSpace[j], lowerBound+j);
			++count;
		}
	}
}