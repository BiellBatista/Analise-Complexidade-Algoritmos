package br.unip.cc.bnmc;

import javax.swing.JOptionPane;

public class QuickSort extends Sort
{
	private static long count = 0;
	
	public static void quickSortIma()
	{
		recQuickSortIma(0, getnElemsIma() - 1);
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count - 1), "Quick Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}

	public static void recQuickSortIma(int left, int right)
	{
		int size = right - left + 1;

		++count;
		
		if(size < 10)	//ordenaçao por inserção se pequeno
			insertionSortIma(left, right);

			else //quick se grande
			{
				int median = medianOf3Ima(left, right);
				int partition = partitionItIma(left, right, median);
				
				recQuickSortIma(left, partition-1);
				recQuickSortIma(partition+1, right);
			}
	}

	public static int medianOf3Ima(int left, int right)
	{
		int center = (left + right)/2;

		if(getArrayIma(left).getWidth() > getArrayIma(center).getWidth())
			swapIma(left, center);

		if(getArrayIma(left).getWidth() > getArrayIma(right).getWidth())
			swapIma(left, right);

		if(getArrayIma(center).getWidth() > getArrayIma(right).getWidth())
			swapIma(center, right);

		swapIma(center, right-1);	//coloca pivo a direita
		
		return getArrayIma(right - 1).getWidth(); //retorna valor medio
	}

	public static int partitionItIma(int left, int right, int pivot)
	{
		int leftPtr = left;
		int rightPtr = right - 1;

		while(true)
		{
			while(getArrayIma(++leftPtr).getWidth() < pivot)
				++count; //encontra maior

			while(getArrayIma(--rightPtr).getWidth() > pivot)
				++count; //encotra menor

			if(leftPtr >= rightPtr) //se ponteiros cruzam
				break;		//particao feita

			else
				swapIma(leftPtr, rightPtr); //troca elementos
		}
		swapIma(leftPtr, right-1); //retorna pivo
		
		return leftPtr; //retorna posicao do pivo
	}

	public static void insertionSortIma(int left, int right)
	{
		int in, out;

		for(out = left = 1; out <= right; out++)
		{
			Imagem temp = getArrayIma(out);
			in = out;

			while(in >= left && getArrayIma(in - 1).getWidth() >= temp.getWidth())
			{
				setArrayIma(getArrayIma(in - 1), in);
				--in;
			}

			setArrayIma(temp, in);
		}
	}
	
	public static void quickSortInt()
	{
		recQuickSortInt(0, getnElemsInt() - 1);
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count - 1), "Quick Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}

	public static void recQuickSortInt(int left, int right)
	{
		int size = right - left + 1;
		
		++count;
		
		if(size < 10)	//ordenaçao por inserção se pequeno
			insertionSortInt(left, 10);

			else //quick se grande
			{
				int median = medianOf3Int(left, right);
				int partition = partitionItInt(left, right, median);
				
				recQuickSortInt(left, partition-1);
				recQuickSortInt(partition+1, right);
			}
	}

	public static int medianOf3Int(int left, int right)
	{
		int center = (left + right)/2;

		if(getArrayInt(left) > getArrayInt(center))
			swapInt(left, center);

		if(getArrayInt(left) > getArrayInt(right))
			swapInt(left, right);

		if(getArrayInt(center) > getArrayInt(right))
			swapInt(center, right);

		swapInt(center, right-1);	//coloca pivo a direita
		
		return getArrayInt(right - 1); //retorna valor medio
	}

	public static int partitionItInt(int left, int right, int pivot)
	{
		int leftPtr = left;
		int rightPtr = right - 1;

		while(true)
		{
			while(getArrayInt(++leftPtr) < pivot)
				++count; //encontra maior

			while(getArrayInt(--rightPtr) > pivot)
				++count; //encotra menor

			if(leftPtr >= rightPtr) //se ponteiros cruzam
				break;		//particao feita

			else
				swapInt(leftPtr, rightPtr); //troca elementos
			
			++count;
		}
		swapInt(leftPtr, right-1); //retorna pivo
		
		return leftPtr; //retorna posicao do pivo
	}

	public static void insertionSortInt(int left, int right)
	{
		int in, out;

		for(out = left = 1; out <= right; out++)
		{
			int temp = getArrayInt(out);
			in = out;

			while(in >= left && getArrayInt(in - 1) >= temp)
			{
				setArrayInt(getArrayInt(in - 1), in);
				--in;
				++count;
			}

			setArrayInt(temp, in);
			++count;
		}
	}
}