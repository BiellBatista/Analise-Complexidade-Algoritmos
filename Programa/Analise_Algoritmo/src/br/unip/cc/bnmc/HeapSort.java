package br.unip.cc.bnmc;

import javax.swing.JOptionPane;

public class HeapSort extends Sort
{
	private static int out;
	private static int in;
	private static long count;
	
	public static void heapSortIma()
	{
		int p;
		
		out = getnElemsIma()-1;
		
		for(p = out / 2; p >= 1; --p)
		{
			peneiraIma(p, out);
			++count;
		}
		
		for(in = out; in >= 2; --in)
		{
			swapIma(1, in);
			peneiraIma(1, in - 1);
			++count;
		}
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Heap Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}

	public static void peneiraIma(int p, int m)
	{
		int x = getArrayIma(p).getWidth() ;
		
		while(2 * p <= m)
		{
			int f = 2 * p;
			if(f < m && getArrayIma(f).getWidth() < getArrayIma(f + 1).getWidth() )
				++f;
			
			if(x >= getArrayIma(f).getWidth() )
				break;
			
			setArrayIma(getArrayIma(f), p); 
			p = f;
			++count;
		}
		
		setArrayInt(x, p);
	}
	
	public static void heapSortInt()
	{
		int p;
		
		out = getnElemsInt()-1;
		
		for(p = out / 2; p >= 1; --p)
		{
			peneiraInt(p, out);
			++count;
		}
		
		for(in = out; in >= 2; --in)
		{
			swapInt(1, in);
			peneiraInt(1, in - 1);
			++count;
		}
		
		JOptionPane.showMessageDialog(null, "Número de interações: " + String.valueOf(count), "Heap Sort", JOptionPane.INFORMATION_MESSAGE);
		count = 0;
	}

	public static void peneiraInt(int p, int m)
	{
		int x = getArrayInt(p);
		
		while(2 * p <= m)
		{
			int f = 2 * p;
			if(f < m && getArrayInt(f) < getArrayInt(f + 1))
				++f;
			
			if(x >= getArrayInt(f))
				break;
			
			setArrayInt(getArrayInt(f), p); 
			p = f;
			++count;
		}
		
		setArrayInt(x, p);
	}
}